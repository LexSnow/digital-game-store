package com.lex.gamestoreapp.serviceimpl;

import com.lex.gamestorelib.model.Currency;
import com.lex.gamestorelib.model.GamePlatform;
import com.lex.gamestorelib.model.Genre;
import com.lex.gamestorelib.model.dto.GamePriceUpdateDTO;
import com.lex.gamestorelib.model.entity.Game;
import com.lex.gamestorelib.model.exceptions.GameNotFoundException;
import com.lex.gamestorelib.repository.GameRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
class GameServiceImplTest {
    @Mock
    private GameRepository gameRepository;
    @InjectMocks
    private GameServiceImpl gameService;
    private Game game;
    @BeforeEach
    void setup(){
        game = Game.builder()
                .id(1)
                .title("Cyberpunk 2077")
                .price(30.0)
                .currency(Currency.USD)
                .gamePlatform(GamePlatform.PC)
                .genres(Collections.singleton(Genre.ROLE_PLAYING))
                .releaseDate(LocalDate.of(2020, 10, 12))
                .build();
    }

    @AfterEach
    void teardown(){
        this.game = null;
    }

    @Test
    void should_create_game() {
        gameService.createGame(game);
        verify(gameRepository, times(1)).save(game);
    }

    @Test
    void should_update_price_and_currency() throws GameNotFoundException {
        ArgumentCaptor<Game> gameArgumentCaptor = ArgumentCaptor.forClass(Game.class);
        GamePriceUpdateDTO dto = new GamePriceUpdateDTO();
        dto.setPrice(50.0);
        dto.setCurrency(Currency.EUR);
        when(gameRepository.findById(1)).thenReturn(Optional.ofNullable(game));
        gameService.updateGamePrice(1, dto);
        verify(gameRepository, times(1)).save(gameArgumentCaptor.capture());
        Game savedGame = gameArgumentCaptor.getValue();
        assertThat(savedGame.getPrice()).isEqualTo(50.0);
        assertThat(savedGame.getCurrency()).isEqualTo(Currency.EUR);
    }
    @Test
    void should_throw_GameNotFoundException(){
        Exception exception = assertThrows(GameNotFoundException.class, () -> {gameService.getGame(1);});
        assertThat(exception.getMessage()).isEqualTo("No game with id 1 found");
    }
}
