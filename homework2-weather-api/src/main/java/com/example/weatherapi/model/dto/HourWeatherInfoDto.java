package com.example.weatherapi.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class HourWeatherInfoDto {

	private double tempC;
	private String time;
	private ConditionDto condition;

}