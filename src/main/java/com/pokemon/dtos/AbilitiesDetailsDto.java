package com.pokemon.dtos;

public class AbilitiesDetailsDto {

  private String name;
  
  private String url;

  @Override
  public String toString() {
    return "name:" + this.name + "url:" + this.url;
  }

  public String getName() {
    return name;
  }
  public String getUrl() {
    return url;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setUrl(String url) {
    this.url = url;
  }
}
