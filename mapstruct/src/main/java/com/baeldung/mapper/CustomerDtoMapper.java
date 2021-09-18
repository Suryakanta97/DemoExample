package com.surya.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.surya.dto.CustomerDto;
import com.surya.entity.Customer;

@Mapper
public interface CustomerDtoMapper {

    @Mapping(source = "firstName", target = "forename")
    @Mapping(source = "lastName", target = "surname")
    CustomerDto from(Customer customer);
}
