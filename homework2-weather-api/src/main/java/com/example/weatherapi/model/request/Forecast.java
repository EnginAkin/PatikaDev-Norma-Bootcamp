package com.example.weatherapi.model.request;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
public class Forecast{

	@JsonProperty("forecastday")
	private List<ForecastdayItem> forecastday;
}