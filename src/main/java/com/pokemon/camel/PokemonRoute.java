package com.pokemon.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PokemonRoute extends RouteBuilder {

  @Autowired
  private StartProcessor startProcessor;

  private String timer = "timer:pokemonImporterTimer?period=60000";

  @Override
	public void configure() throws Exception {

    from(timer)
    .id("transactTimer")
    .process(startProcessor);
  }
  
}
