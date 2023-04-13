package com.lex.gamestorelib.model.dto.mapper;

import com.lex.gamestorelib.model.dto.AddressDTO;
import com.lex.gamestorelib.model.dto.CompanyDTO;
import com.lex.gamestorelib.model.entity.Address;
import com.lex.gamestorelib.model.entity.Company;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompanyMapper {
    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);
    CompanyDTO companyToCompanyDTO(Company company);

    AddressDTO addressToAddressDTO(Address address);
    void update (@MappingTarget Company company, CompanyDTO companyDTO);
}
