package com.lex.gamestoreapp.serviceimpl;

import com.lex.gamestorelib.model.Currency;
import com.lex.gamestorelib.model.entity.Game;
import com.lex.gamestorelib.model.exceptions.GameNotFoundException;
import com.lex.gamestorelib.repository.GameRepository;
import com.lex.gamestorelib.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    @Override
    public void createGame(Game game) {
        gameRepository.save(game);
    }

    @Override
    public void updateGamePrice(Integer id, Double newPrice, Currency currency) throws GameNotFoundException {
        Game game = gameRepository.findById(id).orElseThrow(() -> new GameNotFoundException(id));
        game.setPrice(newPrice);
        game.setCurrency(currency);
        gameRepository.save(game);
    }

    @Override
    public void deleteGame(Integer id) {
        gameRepository.deleteById(id);
    }

    @Override
    public List<Game> getGames() {
        return gameRepository.findAll();
    }

    @Override
    public Game getGame(Integer id) throws GameNotFoundException{
        return gameRepository.findById(id).orElseThrow(() -> new GameNotFoundException(id));
    }
}
