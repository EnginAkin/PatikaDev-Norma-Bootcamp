package com.example.weatherapi.core.utility.mapper;
import org.modelmapper.ModelMapper;

public interface ModelMapperService {

    ModelMapper forDto();
    ModelMapper forRequest();

}
