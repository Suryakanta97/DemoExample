package com.surya.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.surya.dto.CarDTO;
import com.surya.entity.Car;

@Mapper
public interface CarMapper {
    
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
    
    CarDTO carToCarDTO(Car car);
}
