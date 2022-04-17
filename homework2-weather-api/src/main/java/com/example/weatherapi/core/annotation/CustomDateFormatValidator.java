package com.example.weatherapi.core.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomDateFormatValidator implements ConstraintValidator<CustomDateFormat,String> {

    @Override
    public boolean isValid(String date, ConstraintValidatorContext context) {
        return  date.matches("([0-9]{4})-([0-9]{2})-([0-9]{2})"); // basic regex for date format example format : 2022-04-15
    }
}
