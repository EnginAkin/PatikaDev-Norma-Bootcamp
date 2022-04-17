package com.example.weatherapi.core.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "of")
public class GeneralResponse {
    private Object data;
    private String message;
    private Boolean isSuccessful;

    public GeneralResponse(Boolean isSuccessful){
        this.isSuccessful=isSuccessful;
    }
    public GeneralResponse(Boolean isSuccessful,String message){
        this.isSuccessful=isSuccessful;
        this.message=message;
    }
}
