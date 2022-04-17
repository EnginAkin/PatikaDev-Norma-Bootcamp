package com.example.weatherapi.core.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
public class GeneralErrorResponse extends GeneralResponse{

    public GeneralErrorResponse() {
        super(false);
    }
    public GeneralErrorResponse(String message) {
        super(false,message);
    }

    public GeneralErrorResponse(Object data, String message) {
        super(data, message, false);
    }
}
