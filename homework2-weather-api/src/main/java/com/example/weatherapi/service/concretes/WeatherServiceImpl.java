package com.example.weatherapi.service.concretes;

import com.example.weatherapi.core.constant.ErrorConstant;
import com.example.weatherapi.core.constant.UriConstant;
import com.example.weatherapi.core.exception.AirQualityIndexFormatException;
import com.example.weatherapi.core.exception.AlertParameterFormatException;
import com.example.weatherapi.core.utility.mapper.ModelMapperService;
import com.example.weatherapi.model.dto.CurrentWeatherDto;
import com.example.weatherapi.model.dto.ForecastWeatherApiDto;
import com.example.weatherapi.model.dto.HistoryWeatherApiDto;
import com.example.weatherapi.service.abstracts.WeatherApiService;
import com.example.weatherapi.service.abstracts.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {

    private final ModelMapperService modelMapperService;

    private final WeatherApiService weatherApiService;

    @Autowired
    public WeatherServiceImpl(ModelMapperService modelMapperService, WeatherApiService weatherApiService){
        this.weatherApiService=weatherApiService;
        this.modelMapperService=modelMapperService;
    }
    @Override
    public CurrentWeatherDto getCurrentWeatherWithCityName(String cityName, String airQualityIndex) throws AirQualityIndexFormatException {
        String url= setParameterCurrentWeatherUrl(cityName,airQualityIndex);
        return this.modelMapperService.forDto().map(weatherApiService.getForCurrentApiRequest(url),CurrentWeatherDto.class);
    }

    @Override
    public ForecastWeatherApiDto getForecastWeatherApiWithParameter(String cityName, String airQualityIndex, Integer days, String alert) throws AirQualityIndexFormatException, AlertParameterFormatException {
        String url= setParameterForecastWeatherUrl(cityName,airQualityIndex,days,alert);
        return this.modelMapperService.forDto().map(weatherApiService.getForForecastApiRequest(url),ForecastWeatherApiDto.class);
    }

    @Override
    public HistoryWeatherApiDto getHistoryWeatherApiWithDate(String city, String date) {
        String url= UriConstant.HISTORY_WEATHER_API_URI +"key="+UriConstant.API_KEY +"&q="+city+"&dt="+date;
        return this.modelMapperService.forDto().map(weatherApiService.getHistoryWeatherApiRequest(url), HistoryWeatherApiDto.class);
    }

    private String setParameterForecastWeatherUrl(String cityName, String airQualityIndex, Integer days, String alert) throws AirQualityIndexFormatException, AlertParameterFormatException {
        String url= UriConstant.FORECAST_URI +"key="+UriConstant.API_KEY +"&q="+cityName;
        url+="&days="+days;
        if(checkIfAiqIsYes(airQualityIndex)) url+="&aqi=yes";
        else if(!checkIfStrIsNo(airQualityIndex)) throw new AirQualityIndexFormatException(ErrorConstant.AIR_QUALITY_ERROR);
        if(checkIfAlertsIsYes(alert)) url+="&alert=yes";
        else if(!checkIfStrIsNo(alert)) throw new AlertParameterFormatException(ErrorConstant.ALERT_ERROR);
        return url;
    }
    private String setParameterCurrentWeatherUrl(String cityName, String airQualityIndex) throws AirQualityIndexFormatException {
        String url= UriConstant.CURRENT_URI +"key="+UriConstant.API_KEY +"&q="+cityName;
        if(checkIfAiqIsYes(airQualityIndex)) url+="&aqi=yes";
        else if(checkIfStrIsNo(airQualityIndex)) ;
        else throw new AirQualityIndexFormatException(ErrorConstant.AIR_QUALITY_ERROR);
        return url;
    }
    private boolean checkIfAiqIsYes(String aiq){
        return aiq.equals("yes");
    }
    private boolean checkIfDayInRange(int day){
        return day<0 || day>10;
    }
    private boolean checkIfStrIsNo(String aiq){
        return aiq.equals("no");
    }
    private boolean checkIfAlertsIsYes(String alert){
        return alert.equals("yes");
    }
}
