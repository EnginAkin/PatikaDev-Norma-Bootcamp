package com.example.weatherapi.core.annotation;

import com.example.weatherapi.core.constant.ErrorConstant;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ FIELD,METHOD ,PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = { OnlyCityNameValidator.class })
public @interface CheckCityName {

    String message() default ErrorConstant.CHECK_CITY_NAME_ERROR;

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
