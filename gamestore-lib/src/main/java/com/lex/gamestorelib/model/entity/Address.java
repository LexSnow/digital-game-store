package com.lex.gamestorelib.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "address")
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;
    @Column(name = "house_number")
    private String houseNumber;
    @Column(name = "postal_code")
    private String postalCode;
    @OneToMany(mappedBy = "address")
    private Set<Company> companySet;
}
