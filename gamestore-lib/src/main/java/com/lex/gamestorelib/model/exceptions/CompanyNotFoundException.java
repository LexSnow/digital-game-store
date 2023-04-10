package com.lex.gamestorelib.model.exceptions;

import java.io.IOException;

public class CompanyNotFoundException extends IOException {
    public CompanyNotFoundException(Integer id){
        super("No company with id " + id + " found");
    }
}
