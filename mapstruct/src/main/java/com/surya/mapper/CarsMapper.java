package com.surya.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.surya.dto.CarDTO;
import com.surya.dto.FuelType;
import com.surya.entity.BioDieselCar;
import com.surya.entity.Car;
import com.surya.entity.ElectricCar;

@Mapper
public abstract class CarsMapper {

    @BeforeMapping
    protected void enrichDTOWithFuelType(Car car, @MappingTarget CarDTO carDto) {
        if (car instanceof ElectricCar)
            carDto.setFuelType(FuelType.ELECTRIC);
        if (car instanceof BioDieselCar)
            carDto.setFuelType(FuelType.BIO_DIESEL);
    }

    @AfterMapping
    protected void convertNameToUpperCase(@MappingTarget CarDTO carDto) {
        carDto.setName(carDto.getName().toUpperCase());
    }

    public abstract CarDTO toCarDto(Car car);

}
