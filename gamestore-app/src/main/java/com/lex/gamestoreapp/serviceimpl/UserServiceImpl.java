package com.lex.gamestoreapp.serviceimpl;

import com.lex.gamestorelib.model.dto.UserDTO;
import com.lex.gamestorelib.model.dto.mapper.UserMapper;
import com.lex.gamestorelib.model.entity.User;
import com.lex.gamestorelib.model.exceptions.UserNotFoundException;
import com.lex.gamestorelib.repository.UserRepository;
import com.lex.gamestorelib.service.UserService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
private final UserRepository userRepository;
private final UserMapper userMapper = Mappers.getMapper(UserMapper.class);
    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(Integer id, UserDTO userDTO) throws UserNotFoundException {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        userMapper.update(user, userDTO);
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Integer id) throws UserNotFoundException {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }

    @Override
    public User getByUsername(String username){
        return userRepository.findByUsername(username);
    }
}
