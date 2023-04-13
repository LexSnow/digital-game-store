package com.lex.gamestorelib.model.exceptions;

import java.io.IOException;

public class AddressNotFoundException extends IOException {
    public AddressNotFoundException(Integer id){super("No address with id " + id + " found");}
}
