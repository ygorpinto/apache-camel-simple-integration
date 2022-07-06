package com.pokemon.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PokemonDataDto {

  private List<AbilityDTO> abilities;

  private String name;

  @JsonProperty("base_experience")
  private Integer baseExperience;

  private SpritesDTO sprites;

  public List<AbilityDTO> getAbilities() {
    return abilities;
  }

  public Integer getBaseExperience() {
    return baseExperience;
  }

  public String getName() {
    return name;
  }

  public SpritesDTO getSprites() {
    return sprites;
  }

  public void setAbilities(List<AbilityDTO> abilities) {
    this.abilities = abilities;
  }

  public void setBaseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSprites(SpritesDTO sprites) {
    this.sprites = sprites;
  }
  
}
