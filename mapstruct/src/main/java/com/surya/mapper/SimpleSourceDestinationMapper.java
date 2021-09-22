package com.surya.mapper;

import com.surya.dto.SimpleSource;
import com.surya.entity.SimpleDestination;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SimpleSourceDestinationMapper {

    SimpleDestination sourceToDestination(SimpleSource source);

    SimpleSource destinationToSource(SimpleDestination destination);

}
