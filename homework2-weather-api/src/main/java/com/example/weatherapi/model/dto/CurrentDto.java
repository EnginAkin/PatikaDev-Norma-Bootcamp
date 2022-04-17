package com.example.weatherapi.model.dto;

import com.example.weatherapi.model.request.AirQuality;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CurrentDto {
    private double feelslikeC;

    private double uv;

    private String lastUpdated;

    private double feelslikeF;

    private AirQuality airQuality;

    private double tempC;

    private int cloud;

    private ConditionDto condition;

    private double windMph;

}
