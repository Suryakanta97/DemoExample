package com.surya.performancetests.mapstruct;

import com.surya.performancetests.Converter;
import com.surya.performancetests.model.destination.DestinationCode;
import com.surya.performancetests.model.source.SourceCode;
import com.surya.performancetests.model.source.SourceOrder;
import com.surya.performancetests.model.destination.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapStructConverter extends Converter {
    MapStructConverter MAPPER = Mappers.getMapper(MapStructConverter.class);

    @Mapping(source = "status", target = "orderStatus")
    @Override
    Order convert(SourceOrder sourceOrder);

    @Override
    DestinationCode convert(SourceCode sourceCode);
}
