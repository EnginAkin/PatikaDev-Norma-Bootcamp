package com.example.weatherapi.core.annotation;

import com.example.weatherapi.core.constant.UriConstant;
import com.example.weatherapi.service.abstracts.CountrySnowApiService;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@RequiredArgsConstructor
@Data
public class OnlyCityNameValidator implements ConstraintValidator<CheckCityName,String> {

    private final CountrySnowApiService countrySnowApiService;

    @Override
    public boolean isValid(String cityName, ConstraintValidatorContext context) {
        cityName=cityName.toLowerCase().substring(0, 1).toUpperCase()+cityName.substring(1); // change first letter to upper case
        return countrySnowApiService.getAllCity(UriConstant.CITY_API_URI).contains(cityName);
    }
}



