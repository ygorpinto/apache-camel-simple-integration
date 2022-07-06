package com.pokemon.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpritesDTO {

  @JsonProperty("back_default")
  private String backDefault;

  @JsonProperty("back_female")
  private String backFemale;

  @JsonProperty("back_shiny")
  private String backShiny;

  @JsonProperty("back_shiny_female")
  private String backShinyFemale;

  @JsonProperty("front_default")
  private String frontDefault;

  @JsonProperty("front_female")
  private String frontFemale;

  @JsonProperty("front_shiny")
  private String frontShiny;


  public String getBackDefault() {
    return backDefault;
  }

  public String getBackFemale() {
    return backFemale;
  }

  public String getBackShiny() {
    return backShiny;
  }

  public String getBackShinyFemale() {
    return backShinyFemale;
  }

  public String getFrontDefault() {
    return frontDefault;
  }

  public String getFrontFemale() {
    return frontFemale;
  }

  public String getFrontShiny() {
    return frontShiny;
  }

  public void setBackDefault(String backDefault) {
    this.backDefault = backDefault;
  }

  public void setBackFemale(String backFemale) {
    this.backFemale = backFemale;
  }

  public void setBackShiny(String backShiny) {
    this.backShiny = backShiny;
  }

  public void setBackShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
  }

  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }
  
}
