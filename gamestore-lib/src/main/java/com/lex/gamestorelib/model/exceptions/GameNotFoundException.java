package com.lex.gamestorelib.model.exceptions;

import java.io.IOException;
public class GameNotFoundException extends IOException {
    public GameNotFoundException(Integer id){
        super("No game with id " + id + " found");
    }
}
