package com.example.weatherapi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class WeatherApiApplication {

    // weather stack : 8e972e97b8c42339a9ae41e85cceda68

    public static void main(String[] args) throws ParseException {
        SpringApplication.run(WeatherApiApplication.class, args);
    }






}
