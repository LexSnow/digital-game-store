package com.lex.gamestorelib.model.dto;

import com.lex.gamestorelib.model.Currency;
import com.lex.gamestorelib.model.GamePlatform;
import com.lex.gamestorelib.model.Genre;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Collection;
@Getter
@Setter
public class GameDTO {
    private String title;
    private LocalDate releaseDate;
    private Double price;
    private Currency currency;
    private CompanyDTO developer;
    private CompanyDTO publisher;
    private GamePlatform gamePlatform;
    private Collection<Genre> genres;
    private String series;
}
