package com.example.weatherapi.model.dto;

import com.example.weatherapi.model.request.Alerts;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ForecastWeatherApiDto {

    private Alerts alerts;

    private CurrentDto current;

    private LocationDto location;

    private ForecastDto forecast;
}
