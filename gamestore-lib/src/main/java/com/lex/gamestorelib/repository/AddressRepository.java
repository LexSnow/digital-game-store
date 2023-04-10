package com.lex.gamestorelib.repository;

import com.lex.gamestorelib.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    Address getAddressByStreet(String street);
    Address getAddressByCity(String city);
    Address getAddressByCountry(String country);
}