package com.example.weatherapi.service.abstracts;

import com.example.weatherapi.model.request.CurrentWeatherApiRequest;
import com.example.weatherapi.model.request.ForecastWeatherApiRequest;
import com.example.weatherapi.model.request.HistoryWeatherApiRequest;

public interface WeatherApiService {

     ForecastWeatherApiRequest getForForecastApiRequest(String url);
     CurrentWeatherApiRequest getForCurrentApiRequest(String url);
     HistoryWeatherApiRequest getHistoryWeatherApiRequest(String url);
}
