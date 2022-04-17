package com.example.weatherapi.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Getter
@Setter
public class HourWeatherInfo {

	@JsonProperty("feelslike_c")
	private double feelslikeC;

	@JsonProperty("feelslike_f")
	private double feelslikeF;

	@JsonProperty("wind_degree")
	private int windDegree;

	@JsonProperty("windchill_f")
	private double windchillF;

	@JsonProperty("windchill_c")
	private double windchillC;

	@JsonProperty("temp_c")
	private double tempC;

	@JsonProperty("temp_f")
	private double tempF;

	@JsonProperty("cloud")
	private int cloud;

	@JsonProperty("wind_kph")
	private double windKph;

	@JsonProperty("wind_mph")
	private double windMph;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("dewpoint_f")
	private double dewpointF;

	@JsonProperty("will_it_rain")
	private int willItRain;

	@JsonProperty("uv")
	private double uv;

	@JsonProperty("heatindex_f")
	private double heatindexF;

	@JsonProperty("dewpoint_c")
	private double dewpointC;

	@JsonProperty("is_day")
	private int isDay;

	@JsonProperty("precip_in")
	private double precipIn;

	@JsonProperty("heatindex_c")
	private double heatindexC;

	@JsonProperty("wind_dir")
	private String windDir;

	@JsonProperty("gust_mph")
	private double gustMph;

	@JsonProperty("pressure_in")
	private double pressureIn;

	@JsonProperty("chance_of_rain")
	private int chanceOfRain;

	@JsonProperty("gust_kph")
	private double gustKph;

	@JsonProperty("precip_mm")
	private double precipMm;

	@JsonProperty("condition")
	private Condition condition;

	@JsonProperty("will_it_snow")
	private int willItSnow;

	@JsonProperty("vis_km")
	private double visKm;

	@JsonProperty("time_epoch")
	private int timeEpoch;

	@JsonProperty("time")
	private String time;

	@JsonProperty("chance_of_snow")
	private int chanceOfSnow;

	@JsonProperty("pressure_mb")
	private double pressureMb;

	@JsonProperty("vis_miles")
	private double visMiles;
}