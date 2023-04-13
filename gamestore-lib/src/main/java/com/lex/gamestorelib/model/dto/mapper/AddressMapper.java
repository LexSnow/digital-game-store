package com.lex.gamestorelib.model.dto.mapper;

import com.lex.gamestorelib.model.dto.AddressDTO;
import com.lex.gamestorelib.model.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);
    AddressDTO addressToAddressDTOMapper(Address address);
    void update(@MappingTarget Address address, AddressDTO addressDTO);
}
