package com.example.weatherapi.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DayWeatherInfoDto {

	private double avgvisKm;

	private double avgtempC;

	private int dailyChanceOfSnow;

	private double maxtempC;

	private double mintempC;

	private ConditionDto condition;

	private double maxwindMph;

	private int dailyChanceOfRain;

}