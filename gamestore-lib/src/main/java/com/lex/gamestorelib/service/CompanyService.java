package com.lex.gamestorelib.service;

import com.lex.gamestorelib.model.dto.CompanyDTO;
import com.lex.gamestorelib.model.entity.Company;
import com.lex.gamestorelib.model.exceptions.CompanyNotFoundException;

import java.util.List;

public interface CompanyService {
    void createCompany(Company company);
    void updateCompany(Integer id, CompanyDTO companyDTO) throws CompanyNotFoundException;
    void deleteCompany(Integer id);
    List<Company> getCompanies();
    Company getCompany(Integer id) throws CompanyNotFoundException;
}
