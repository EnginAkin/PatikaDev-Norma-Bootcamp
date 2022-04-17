package com.example.weatherapi.service.abstracts;

import com.example.weatherapi.core.exception.*;
import com.example.weatherapi.model.dto.CurrentWeatherDto;
import com.example.weatherapi.model.dto.ForecastWeatherApiDto;
import com.example.weatherapi.model.dto.HistoryWeatherApiDto;
import org.springframework.web.client.HttpClientErrorException;

public interface WeatherService {

    CurrentWeatherDto getCurrentWeatherWithCityName(String cityName, String airQualityIndex) throws UnauthorizedException, AirQualityIndexFormatException;
    ForecastWeatherApiDto getForecastWeatherApiWithParameter(String cityName, String airQualityIndex, Integer days, String alert) throws UnauthorizedException, AirQualityIndexFormatException, AlertParameterFormatException;
    HistoryWeatherApiDto getHistoryWeatherApiWithDate(String city, String date) throws HttpClientErrorException;
}
