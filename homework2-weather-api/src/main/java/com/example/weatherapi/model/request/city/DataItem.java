package com.example.weatherapi.model.request.city;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Getter
@Setter
public class DataItem{

	@JsonProperty("country")
	private String country;

	@JsonProperty("cities")
	private List<String> cities;

	@JsonProperty("iso2")
	private String iso2;

	@JsonProperty("iso3")
	private String iso3;


}