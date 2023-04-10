package com.lex.gamestorelib.model.dto;

import com.lex.gamestorelib.model.CompanyType;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
@Getter
@Setter
public class CompanyDTO {
    private String name;
    private AddressDTO address;
    private Collection<CompanyType> companyType;
}
