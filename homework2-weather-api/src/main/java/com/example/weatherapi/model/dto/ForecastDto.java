package com.example.weatherapi.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class ForecastDto {
    private List<ForecastDayItemDto> forecastday;
}
