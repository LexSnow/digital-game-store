package com.lex.gamestoreapp.controller;

import com.lex.gamestorelib.model.dto.GameDTO;
import com.lex.gamestorelib.model.dto.mapper.GameMapper;
import com.lex.gamestorelib.model.entity.Game;
import com.lex.gamestorelib.model.exceptions.GameNotFoundException;
import com.lex.gamestorelib.service.GameService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;
    private final GameMapper gameMapper = Mappers.getMapper(GameMapper.class);
    @GetMapping("/games")
    List<GameDTO> getAllGames(){
        return gameMapper.gamesToGameDTOs(gameService.getGames());
    }
    @GetMapping("/games/{id}")
    GameDTO getGame(@PathVariable Integer id) throws GameNotFoundException {
        return gameMapper.gameToGameDTO(gameService.getGame(id));
    }

    @PostMapping("/games")
    void createGame(@RequestBody Game game){
        gameService.createGame(game);
    }
}
