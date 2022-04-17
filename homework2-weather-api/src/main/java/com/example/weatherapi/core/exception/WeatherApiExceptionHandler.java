package com.example.weatherapi.core.exception;

import com.example.weatherapi.core.response.GeneralErrorResponse;
import com.example.weatherapi.core.response.GeneralResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class WeatherApiExceptionHandler extends ResponseEntityExceptionHandler{

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler
    public GeneralResponse handleUnauthorizedException(HttpClientErrorException exception){
        return GeneralErrorResponse.of().message(exception.getMessage()).build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler
    public GeneralResponse handleAiqException(AirQualityIndexFormatException exception){
        return GeneralErrorResponse.of().message(exception.getMessage()).build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler
    public GeneralResponse handleAlertParameterException(AlertParameterFormatException exception){
        return GeneralErrorResponse.of().message(exception.getMessage()).build();
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler
    public GeneralResponse handleValidationException(ConstraintViolationException exception){
        return GeneralErrorResponse.of().message(exception.getMessage()).build();
    }








}
