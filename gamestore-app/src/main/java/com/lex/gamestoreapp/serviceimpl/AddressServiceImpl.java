package com.lex.gamestoreapp.serviceimpl;

import com.lex.gamestorelib.model.dto.AddressDTO;
import com.lex.gamestorelib.model.dto.mapper.AddressMapper;
import com.lex.gamestorelib.model.entity.Address;
import com.lex.gamestorelib.model.exceptions.AddressNotFoundException;
import com.lex.gamestorelib.repository.AddressRepository;
import com.lex.gamestorelib.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper = Mappers.getMapper(AddressMapper.class);

    @Override
    public void createAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public void updateAddress(Integer id, AddressDTO addressDTO) throws AddressNotFoundException {
        Address address = addressRepository.findById(id).orElseThrow(() -> new AddressNotFoundException(id));
        addressMapper.update(address, addressDTO);
        addressRepository.save(address);
    }

    @Override
    public void deleteAddress(Integer id) {
        addressRepository.deleteById(id);
    }

    @Override
    public List<Address> getAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddress(Integer id) throws AddressNotFoundException {
        return addressRepository.findById(id).orElseThrow(() -> new AddressNotFoundException(id));
    }
}
