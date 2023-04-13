package com.lex.gamestoreapp.serviceimpl;

import com.lex.gamestorelib.model.dto.CompanyDTO;
import com.lex.gamestorelib.model.dto.mapper.CompanyMapper;
import com.lex.gamestorelib.model.entity.Company;
import com.lex.gamestorelib.model.exceptions.CompanyNotFoundException;
import com.lex.gamestorelib.repository.CompanyRepository;
import com.lex.gamestorelib.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper = Mappers.getMapper(CompanyMapper.class);

    @Override
    public void createCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public void updateCompany(Integer id, CompanyDTO companyDTO) throws CompanyNotFoundException {
        Company company = companyRepository.findById(id).orElseThrow(() -> new CompanyNotFoundException(id));
        companyMapper.update(company, companyDTO);
        companyRepository.save(company);
    }

    @Override
    public void deleteCompany(Integer id) {
        companyRepository.deleteById(id);
    }

    @Override
    public List<Company> getCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company getCompany(Integer id) throws CompanyNotFoundException {
        return companyRepository.findById(id).orElseThrow(() -> new CompanyNotFoundException(id));
    }
}
