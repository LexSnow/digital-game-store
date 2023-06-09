package com.lex.gamestorelib.service;

import com.lex.gamestorelib.model.dto.GamePriceUpdateDTO;
import com.lex.gamestorelib.model.entity.Game;
import com.lex.gamestorelib.model.exceptions.GameNotFoundException;

import java.util.List;

public interface GameService {
    void createGame(Game game);
    void updateGamePrice(Integer id, GamePriceUpdateDTO gamePriceUpdateDTO) throws GameNotFoundException;
    void deleteGame(Integer id);
    List<Game> getGames();
    Game getGame(Integer id) throws GameNotFoundException;
}
