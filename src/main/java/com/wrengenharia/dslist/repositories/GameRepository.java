package com.wrengenharia.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wrengenharia.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	
	
}
