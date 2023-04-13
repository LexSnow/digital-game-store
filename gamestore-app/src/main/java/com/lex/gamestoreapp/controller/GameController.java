package com.lex.gamestoreapp.controller;

import com.lex.gamestorelib.model.dto.GameDTO;
import com.lex.gamestorelib.model.dto.GamePriceUpdateDTO;
import com.lex.gamestorelib.model.dto.mapper.GameMapper;
import com.lex.gamestorelib.model.entity.Game;
import com.lex.gamestorelib.model.exceptions.GameNotFoundException;
import com.lex.gamestorelib.service.GameService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/games")
public class GameController {

    private final GameService gameService;
    private final GameMapper gameMapper = Mappers.getMapper(GameMapper.class);

    @GetMapping()
    List<GameDTO> getAllGames() {
        return gameMapper.gamesToGameDTOs(gameService.getGames());
    }

    @GetMapping("/{id}")
    GameDTO getGame(@PathVariable Integer id) throws GameNotFoundException {
        return gameMapper.gameToGameDTO(gameService.getGame(id));
    }

    @PostMapping("/admin")
    ResponseEntity<String> addGame(@RequestBody Game game) {
        gameService.createGame(game);
        return ResponseEntity.ok("The game has been added.");
    }

    @DeleteMapping("/admin/{id}")
    ResponseEntity<String> deleteGame(@PathVariable Integer id) {
        gameService.deleteGame(id);
        return ResponseEntity.ok("The game has been deleted.");
    }
    @PatchMapping("/admin/{id}")
    ResponseEntity<String> updateGamePrice(@PathVariable Integer id, @RequestBody GamePriceUpdateDTO gamePriceUpdateDTO) throws GameNotFoundException {
        gameService.updateGamePrice(id, gamePriceUpdateDTO);
        return ResponseEntity.ok("The price has been updated");
    }
}
