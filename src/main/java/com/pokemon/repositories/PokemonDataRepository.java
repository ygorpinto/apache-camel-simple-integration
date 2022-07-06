package com.pokemon.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.models.PokemonData;

public interface PokemonDataRepository extends JpaRepository<PokemonData,UUID> {
  
}
