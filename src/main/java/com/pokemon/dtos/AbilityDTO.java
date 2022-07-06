package com.pokemon.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbilityDTO {

  @JsonProperty("ability")
  private AbilitiesDetailsDto abilityDetails;

  @JsonProperty("is_hidden")
  private Boolean isHidden;

  private Integer slot;

  @Override
  public String toString() {
    return "abilities " + this.abilityDetails + "slot" + this.slot + "ishidden:" + this.isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public void setAbilityDetails(AbilitiesDetailsDto abilityDetails) {
    this.abilityDetails = abilityDetails;
  }

  public AbilitiesDetailsDto getAbilityDetails() {
    return abilityDetails;
  }

  public Boolean getIsHidden() {
    return isHidden;
  }

  public Integer getSlot() {
    return slot;
  }
  
}
