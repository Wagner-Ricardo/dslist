package com.wrengenharia.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wrengenharia.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	
	
}
