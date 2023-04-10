package com.lex.gamestorelib.model.dto.mapper;

import com.lex.gamestorelib.model.dto.GameDTO;
import com.lex.gamestorelib.model.entity.Game;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface GameMapper {
    GameMapper INSTANCE = Mappers.getMapper(GameMapper.class);
    @Mapping(target = "series", source = "series.title")
    GameDTO gameToGameDTO(Game game);
    List<GameDTO> gamesToGameDTOs(List<Game> games);
}
