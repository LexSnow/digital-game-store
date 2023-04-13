package com.lex.gamestorelib.model.dto.mapper;

import com.lex.gamestorelib.model.dto.UserDTO;
import com.lex.gamestorelib.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    void update(@MappingTarget User user, UserDTO userDTO);
}
