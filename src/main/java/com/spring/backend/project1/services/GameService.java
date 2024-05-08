package com.spring.backend.project1.services;

import com.spring.backend.project1.commons.entities.Game;

import java.util.List;

public interface GameService {

    Game saveGame(Game gameRequest);

    Game getGameById(String id);

    List<Game> getGames();

    void deleteGameById(String id);

    Game updateGame(Game newGame);
}
