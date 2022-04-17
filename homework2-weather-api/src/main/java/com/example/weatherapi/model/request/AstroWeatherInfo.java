package com.example.weatherapi.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Getter
@Setter
public class AstroWeatherInfo {

	@JsonProperty("moonset")
	private String moonset;

	@JsonProperty("moon_illumination")
	private String moonIllumination;

	@JsonProperty("sunrise")
	private String sunrise;

	@JsonProperty("moon_phase")
	private String moonPhase;

	@JsonProperty("sunset")
	private String sunset;

	@JsonProperty("moonrise")
	private String moonrise;
}