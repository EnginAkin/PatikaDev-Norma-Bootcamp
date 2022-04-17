package com.example.weatherapi.core.annotation;

import lombok.SneakyThrows;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExpectedDateValidator implements ConstraintValidator<ExpectedDate,String> {


    @SneakyThrows
    @Override
    public boolean isValid(String compareDate, ConstraintValidatorContext context) {
        // buradaki metod gelen değerin 1 haftadan  önceye  mi ait yoksa sonraya mı ait olduğunu söylüyor
        // bunu yapmanın temel nedeni weather api dan bir haftadan daha önceki verilere erişim kısıtı olduğundan .
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, - 8);
        Date lastWeek = calendar.getTime();
        return simpleDateFormat.parse(simpleDateFormat.format(lastWeek)).before(simpleDateFormat.parse(compareDate));
    }
}
