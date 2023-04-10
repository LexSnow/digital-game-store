package com.lex.gamestorelib.model.dto;

import com.lex.gamestorelib.model.Currency;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GamePriceUpdateDTO {
    private Double price;
    private Currency currency;
}
