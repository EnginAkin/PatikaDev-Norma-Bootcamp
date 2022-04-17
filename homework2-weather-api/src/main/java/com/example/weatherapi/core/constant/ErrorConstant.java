package com.example.weatherapi.core.constant;

public class ErrorConstant {
    public static final String AIR_QUALITY_ERROR ="The QUALITY parameter must only be yes or no.";
    public static final String ALERT_ERROR ="The ALERT parameter must only be yes or no.";
    public static final String CITY_CANNOT_FOUND_ERROR ="City cannot found in all contry";
    public static final String DAY_PARAMETER_IN_NOT_RANGE ="Day must be in 0 to 10" ;
    public static final String CUSTOM_DATE_FORMAT_ERROR = "Date format must be yy-mm-dd";
    public static final String CHECK_CITY_NAME_ERROR = "incoming city name variable did not match any city";
    public static final String CHECK_DATE_AFTER_LAST_WEEK_ERROR = "You can access data for a maximum of one week. Please enter an earlier date.";
}
