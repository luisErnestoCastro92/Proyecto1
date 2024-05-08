package com.spring.backend.project1.controller;

import com.spring.backend.project1.commons.constants.ApiPathVariables;
import com.spring.backend.project1.commons.entities.Game;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(ApiPathVariables.V1_ROUTE + ApiPathVariables.GAME_ROUTE)
public interface GameApi {

    @PostMapping
    ResponseEntity<Game> saveGame(@RequestBody Game game);

    @GetMapping("/{id}")
    ResponseEntity<Game> getGameById(@PathVariable String id);

    @DeleteMapping("/{id}")
    void deleteGameById(@PathVariable String id);

    @GetMapping
    List<Game> getGames();

    @PutMapping("/update/{id}")
    ResponseEntity<Game> updateGame(@RequestBody Game newGame, @PathVariable String id);
}
