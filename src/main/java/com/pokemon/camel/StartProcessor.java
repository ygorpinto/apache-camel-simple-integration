package com.pokemon.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pokemon.dtos.PokemonDataDto;
import com.pokemon.models.PokemonData;
import com.pokemon.repositories.PokemonDataRepository;
import com.pokemon.services.PokemonDataService;

@Component
public class StartProcessor implements Processor {

  @Autowired
  private PokemonDataService service;

  @Autowired
  private PokemonDataRepository repository;

  @Override
  public void process(Exchange exchange) throws Exception {

    for (int i = 1; i <= 905; i ++) {  

      PokemonDataDto pokemonData = service.getPokemonFromApi(String.valueOf(i));

      PokemonData pokemon = new PokemonData();
  
      pokemon.setAbility(pokemonData.getAbilities().get(0).getAbilityDetails().getName());
      pokemon.setBaseExperience(pokemonData.getBaseExperience());
      pokemon.setLogo(pokemonData.getSprites().getFrontDefault());
      pokemon.setName(pokemonData.getName());
  
      System.out.println("salvando pokemon " + pokemon.getName());
  
      repository.save(pokemon);
      
    }  

  }
  
}
