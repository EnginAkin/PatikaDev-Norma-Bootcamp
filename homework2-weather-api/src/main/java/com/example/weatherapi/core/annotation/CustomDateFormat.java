package com.example.weatherapi.core.annotation;

import com.example.weatherapi.core.constant.ErrorConstant;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD,METHOD ,PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = { CustomDateFormatValidator.class })
public @interface CustomDateFormat {


    String message() default ErrorConstant.CUSTOM_DATE_FORMAT_ERROR;

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
