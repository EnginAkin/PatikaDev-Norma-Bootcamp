package com.example.weatherapi.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Getter
@Setter
public class Current{

	@JsonProperty("feelslike_c")
	private double feelslikeC;

	@JsonProperty("uv")
	private double uv;

	@JsonProperty("last_updated")
	private String lastUpdated;

	@JsonProperty("feelslike_f")
	private double feelslikeF;

	@JsonProperty("wind_degree")
	private int windDegree;

	@JsonProperty("last_updated_epoch")
	private int lastUpdatedEpoch;

	@JsonProperty("is_day")
	private int isDay;

	@JsonProperty("precip_in")
	private double precipIn;

	@JsonProperty("air_quality")
	private AirQuality airQuality;

	@JsonProperty("wind_dir")
	private String windDir;

	@JsonProperty("gust_mph")
	private double gustMph;

	@JsonProperty("temp_c")
	private double tempC;

	@JsonProperty("pressure_in")
	private double pressureIn;

	@JsonProperty("gust_kph")
	private double gustKph;

	@JsonProperty("temp_f")
	private double tempF;

	@JsonProperty("precip_mm")
	private double precipMm;

	@JsonProperty("cloud")
	private int cloud;

	@JsonProperty("wind_kph")
	private double windKph;

	@JsonProperty("condition")
	private Condition condition;

	@JsonProperty("wind_mph")
	private double windMph;

	@JsonProperty("vis_km")
	private double visKm;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("pressure_mb")
	private double pressureMb;

	@JsonProperty("vis_miles")
	private double visMiles;
}