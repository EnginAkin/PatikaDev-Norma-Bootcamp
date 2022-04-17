package com.example.weatherapi.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Getter
@Setter
public class DayWeatherInfo {

	@JsonProperty("avgvis_km")
	private double avgvisKm;

	@JsonProperty("uv")
	private double uv;

	@JsonProperty("avgtemp_f")
	private double avgtempF;

	@JsonProperty("avgtemp_c")
	private double avgtempC;

	@JsonProperty("daily_chance_of_snow")
	private int dailyChanceOfSnow;

	@JsonProperty("maxtemp_c")
	private double maxtempC;

	@JsonProperty("maxtemp_f")
	private double maxtempF;

	@JsonProperty("mintemp_c")
	private double mintempC;

	@JsonProperty("avgvis_miles")
	private double avgvisMiles;

	@JsonProperty("daily_will_it_rain")
	private int dailyWillItRain;

	@JsonProperty("mintemp_f")
	private double mintempF;

	@JsonProperty("totalprecip_in")
	private double totalprecipIn;

	@JsonProperty("avghumidity")
	private double avghumidity;

	@JsonProperty("condition")
	private Condition condition;

	@JsonProperty("maxwind_kph")
	private double maxwindKph;

	@JsonProperty("maxwind_mph")
	private double maxwindMph;

	@JsonProperty("daily_chance_of_rain")
	private int dailyChanceOfRain;

	@JsonProperty("totalprecip_mm")
	private double totalprecipMm;

	@JsonProperty("daily_will_it_snow")
	private int dailyWillItSnow;
}