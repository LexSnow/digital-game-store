package com.lex.gamestorelib.service;

import com.lex.gamestorelib.model.entity.Address;

import java.util.Collection;

public interface AddressService {
    void createAddress(Address address);
    void updateAddress(Integer id, Address address);
    void deleteAddress(Integer id);
    Collection<Address> getAddresses();
}
