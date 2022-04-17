package com.example.weatherapi.core.response;

import lombok.Builder;

public class GeneralSuccesfulResponse extends GeneralResponse{

    public GeneralSuccesfulResponse(Object data, String message) {
        super(data, message, true);
    }
    public GeneralSuccesfulResponse(String message) {
        super(true,message);
    }
    public GeneralSuccesfulResponse() {
        super(true);
    }
}
