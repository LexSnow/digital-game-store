package com.lex.gamestorelib.repository;

import com.lex.gamestorelib.model.entity.Company;
import com.lex.gamestorelib.model.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
    Game getGameByTitle(String title);
    Game getGameByDeveloper(Company company);
    Game getGameByPublisher(Company company);
}
