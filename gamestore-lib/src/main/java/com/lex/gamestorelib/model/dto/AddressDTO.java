package com.lex.gamestorelib.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {
    private String street;
    private String city;
    private String country;
    private String houseNumber;
    private String postalCode;
}
