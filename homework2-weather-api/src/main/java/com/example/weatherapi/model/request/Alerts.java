package com.example.weatherapi.model.request;


import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Getter
@Setter
public class Alerts{

	@JsonProperty("alert")
	private List<Object> alert;
}