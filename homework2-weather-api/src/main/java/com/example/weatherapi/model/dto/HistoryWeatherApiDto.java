package com.example.weatherapi.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class HistoryWeatherApiDto {


    private LocationDto location;

    private ForecastDto forecast;
}
