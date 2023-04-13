package com.lex.gamestorelib.service;

import com.lex.gamestorelib.model.dto.AddressDTO;
import com.lex.gamestorelib.model.entity.Address;
import com.lex.gamestorelib.model.exceptions.AddressNotFoundException;

import java.util.List;

public interface AddressService {
    void createAddress(Address address);
    void updateAddress(Integer id, AddressDTO addressDTO) throws AddressNotFoundException;
    void deleteAddress(Integer id);
    List<Address> getAddresses();
    Address getAddress(Integer id) throws AddressNotFoundException;
}
