package com.surya.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.surya.dto.PersonDTO;
import com.surya.entity.Person;

@Mapper
public interface PersonMapper {
    
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);
    
    @Mapping(target = "id", source = "person.id", defaultExpression = "java(java.util.UUID.randomUUID().toString())")
    PersonDTO personToPersonDTO(Person person);
}
