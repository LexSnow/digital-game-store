package com.lex.gamestorelib.service;

import com.lex.gamestorelib.model.dto.UserDTO;
import com.lex.gamestorelib.model.entity.User;
import com.lex.gamestorelib.model.exceptions.UserNotFoundException;

import java.util.List;

public interface UserService {
    void createUser(User user);
    void updateUser(Integer id, UserDTO userDTO) throws UserNotFoundException;
    void deleteUser(Integer id);
    List<User> getUsers();
    User getUser(Integer id) throws UserNotFoundException;
    User getByUsername(String username) throws UserNotFoundException;
}
