package com.spring.backend.project1.services.impl;

import com.spring.backend.project1.commons.entities.Game;
import com.spring.backend.project1.commons.exceptions.GameException;
import com.spring.backend.project1.repositories.GameRepository;
import com.spring.backend.project1.services.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public Game saveGame(Game gameRequest) {
        return this.gameRepository.save(gameRequest);
    }

    @Override
    public Game getGameById(String id) {
        return this.gameRepository.findById(Long.valueOf(id)).orElseThrow(() -> new GameException(HttpStatus.NOT_FOUND, "Error Finding Game"));
    }

    @Override
    public List<Game> getGames() {
        return this.gameRepository.findAll();
    }

    @Override
    public void deleteGameById(String id) {
        this.gameRepository.deleteById(Long.valueOf(id));
    }

    @Override
    public Game updateGame(Game newGame) {
        return this.gameRepository.save(newGame);
    }

}
