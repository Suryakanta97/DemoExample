package com.surya.unmappedproperties.mapper;

import com.surya.unmappedproperties.dto.CarDTO;
import com.surya.unmappedproperties.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDTO carToCarDTO(Car car);
}