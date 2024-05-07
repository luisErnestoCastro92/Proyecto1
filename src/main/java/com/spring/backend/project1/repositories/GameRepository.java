package com.spring.backend.project1.repositories;

import com.spring.backend.project1.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
