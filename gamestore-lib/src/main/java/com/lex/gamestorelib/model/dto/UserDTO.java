package com.lex.gamestorelib.model.dto;

import com.lex.gamestorelib.model.Role;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
@Getter
@Setter
public class UserDTO {
    private String username;
    private String password;
    private Collection<Role> roles;
}
