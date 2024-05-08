package com.spring.backend.project1.repositories;

import com.spring.backend.project1.commons.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
