package com.lex.gamestorelib.model.exceptions;

import java.io.IOException;

public class SeriesNotFoundException extends IOException {
    public SeriesNotFoundException(Integer id) {
        super("No series with id " + id + " found");
    }
}
