package com.example.weatherapi.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Getter
@Setter
public class AirQuality{

	@JsonProperty("no2")
	private double no2;

	@JsonProperty("o3")
	private double o3;

	@JsonProperty("us-epa-index")
	private int usEpaIndex;

	@JsonProperty("so2")
	private double so2;

	@JsonProperty("pm2_5")
	private double pm25;

	@JsonProperty("pm10")
	private double pm10;

	@JsonProperty("co")
	private double co;

	@JsonProperty("gb-defra-index")
	private int gbDefraIndex;
}