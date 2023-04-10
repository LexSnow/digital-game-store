package com.lex.gamestoreapp.serviceimpl;

import com.lex.gamestorelib.model.dto.GamePriceUpdateDTO;
import com.lex.gamestorelib.model.entity.Game;
import com.lex.gamestorelib.model.exceptions.GameNotFoundException;
import com.lex.gamestorelib.repository.GameRepository;
import com.lex.gamestorelib.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;
    @Autowired
    public GameServiceImpl(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    @Override
    public void createGame(Game game) {
        gameRepository.save(game);
    }

    @Override
    public void updateGamePrice(Integer id, GamePriceUpdateDTO gamePriceUpdateDTO) throws GameNotFoundException {
        Game game = gameRepository.findById(id).orElseThrow(() -> new GameNotFoundException(id));
        game.setPrice(gamePriceUpdateDTO.getPrice());
        game.setCurrency(gamePriceUpdateDTO.getCurrency());
        gameRepository.save(game);
    }

    @Override
    public void deleteGame(Integer id) {
        gameRepository.deleteById(id);
    }
    @Override
    public Game getGame(Integer id) throws GameNotFoundException{
        return gameRepository.findById(id).orElseThrow(() -> new GameNotFoundException(id));
    }

    @Override
    public List<Game> getGames() {
        return gameRepository.findAll();
    }
}
