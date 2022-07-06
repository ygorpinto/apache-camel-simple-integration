package com.pokemon.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PokemonData implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column
  private String name;
  
  @Column
  private String logo;
  
  @Column
  private String ability;

  @Column
  private Integer baseExperience;

  public String getAbility() {
    return ability;
  }

  public Integer getBaseExperience() {
    return baseExperience;
  }

  public String getLogo() {
    return logo;
  }

  public String getName() {
    return name;
  }

  public void setAbility(String ability) {
    this.ability = ability;
  }

  public void setBaseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public void setName(String name) {
    this.name = name;
  }
  
}
