package com.lex.gamestorelib.model.exceptions;

import java.io.IOException;

public class UserNotFoundException extends IOException {
    public UserNotFoundException(Integer id){super("No user with id " + id + " found");}
    public UserNotFoundException(String username){super("No user with username" + username + " found");}
}
