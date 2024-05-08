package com.spring.backend.project1.controller.impl;

import com.spring.backend.project1.commons.entities.Game;
import com.spring.backend.project1.controller.GameApi;
import com.spring.backend.project1.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController implements GameApi {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public ResponseEntity<Game> saveGame(@RequestBody Game game) {
        Game createdGame = this.gameService.saveGame(game);
        return ResponseEntity.ok(createdGame);
    }

    @Override
    public ResponseEntity<Game> getGameById(String id) {
        return ResponseEntity.ok(this.gameService.getGameById(id));
    }

    @Override
    public void deleteGameById(String id) {
        this.gameService.deleteGameById(id);
    }

    @Override
    public List<Game> getGames() {
        return this.gameService.getGames();
    }

    @Override
    public ResponseEntity<Game> updateGame(Game newGame, String id) {
        Game game = this.gameService.getGameById(id);
        game.setName(newGame.getName());
        game.setGenero(newGame.getGenero());
        return ResponseEntity.ok(this.gameService.saveGame(game));
    }

}
