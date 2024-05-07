package com.spring.backend.project1.controller;

import com.spring.backend.project1.entities.Game;
import com.spring.backend.project1.repositories.GameRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GameController {

    private final GameRepository gameRepository;

    public GameController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @PostMapping
    private ResponseEntity<Game> saveGame(@RequestBody Game game) {
        Game createdGame = this.gameRepository.saveAndFlush(game);
        return ResponseEntity.ok(createdGame);
    }
}
