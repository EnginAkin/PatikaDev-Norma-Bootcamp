package com.example.weatherapi.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class ForecastDayItemDto {

    private String date;

    private AstroWeatherInfoDto astro;

    private List<HourWeatherInfoDto> hour;

    private DayWeatherInfoDto day;
}
