package com.example.weatherapi.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Getter
@Setter
public class ForecastWeatherApiRequest {

	@JsonProperty("alerts")
	private Alerts alerts;

	@JsonProperty("current")
	private Current current;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("forecast")
	private Forecast forecast;
}