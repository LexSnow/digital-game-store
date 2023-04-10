package com.lex.gamestorelib.service;

import com.lex.gamestorelib.model.Currency;
import com.lex.gamestorelib.model.entity.Game;
import com.lex.gamestorelib.model.exceptions.GameNotFoundException;

import java.util.List;

public interface GameService {
    void createGame(Game game);
    void updateGamePrice(Integer id, Double newPrice, Currency currency) throws GameNotFoundException;
    void deleteGame(Integer id);
    List<Game> getGames();
    Game getGame(Integer id) throws GameNotFoundException;
}
