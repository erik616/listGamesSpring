package com.erikdsouza.listgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erikdsouza.listgames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
