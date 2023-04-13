package com.lex.gamestorelib.repository;

import com.lex.gamestorelib.model.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void should_return_user(){
        String username = "user@gmail.com";
        User user = userRepository.findByUsername(username);
        assertThat(user).isNotNull();
    }
    @Test
    public void should_return_null(){
        User user = userRepository.findByUsername("abc");
        assertThat(user).isNull();
    }
}
