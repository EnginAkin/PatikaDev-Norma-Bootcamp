package com.example.weatherapi.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CurrentWeatherDto {

    private CurrentDto current;

    private LocationDto location;


}
