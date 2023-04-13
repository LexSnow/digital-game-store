package com.lex.gamestoreapp.serviceimpl;

import com.lex.gamestorelib.model.dto.GamePriceUpdateDTO;
import com.lex.gamestorelib.model.dto.mapper.GameMapper;
import com.lex.gamestorelib.model.entity.Game;
import com.lex.gamestorelib.model.exceptions.GameNotFoundException;
import com.lex.gamestorelib.repository.GameRepository;
import com.lex.gamestorelib.service.GameService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;
    private final GameMapper gameMapper = Mappers.getMapper(GameMapper.class);

    @Override
    public void createGame(Game game) {
        gameRepository.save(game);
    }

    @Override
    public void updateGamePrice(Integer id, GamePriceUpdateDTO gamePriceUpdateDTO) throws GameNotFoundException {
        Game game = gameRepository.findById(id).orElseThrow(() -> new GameNotFoundException(id));
        gameMapper.update(game, gamePriceUpdateDTO);
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
