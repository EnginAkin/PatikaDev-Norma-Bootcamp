package com.example.weatherapi.model.request.city;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Getter
@Setter
public class CountryWithCity {

	@JsonProperty("msg")
	private String msg;

	@JsonProperty("data")
	private List<DataItem> data;

	@JsonProperty("error")
	private boolean error;

}