package com.pokemon.services;
import java.time.Duration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.pokemon.dtos.PokemonDataDto;

@Component
public class PokemonDataService {

  private String host = "https://pokeapi.co/api/v2/pokemon/";
  
  private final RestTemplate restTemplate;
	
	public PokemonDataService(RestTemplateBuilder restBuilder) {
		this.restTemplate = restBuilder
								.setConnectTimeout(Duration.ofMillis(50000))
								.build();
	}

  public PokemonDataDto getPokemonFromApi(String id) {
		
		String url = this.host + id;
		
		ResponseEntity<PokemonDataDto> result = this.restTemplate.getForEntity(url, PokemonDataDto.class);
		
		return result.getBody();
	}
}
