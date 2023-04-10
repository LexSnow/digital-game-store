package com.lex.gamestorelib.service;

import com.lex.gamestorelib.model.entity.Company;

import java.util.Collection;

public interface CompanyService {
    void createCompany(Company company);
    void updateCompany(Integer id, Company company);
    void deleteCompany(Integer id);
    Collection<Company> getCompanies();
}
