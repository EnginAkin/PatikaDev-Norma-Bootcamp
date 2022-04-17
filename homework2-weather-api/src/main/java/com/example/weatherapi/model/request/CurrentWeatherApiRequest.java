package com.example.weatherapi.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CurrentWeatherApiRequest {

	@JsonProperty("current")
	private Current current;

	@JsonProperty("location")
	private Location location;


}