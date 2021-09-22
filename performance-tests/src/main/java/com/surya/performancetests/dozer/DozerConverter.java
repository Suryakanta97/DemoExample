package com.surya.performancetests.dozer;

import com.surya.performancetests.Converter;
import com.surya.performancetests.model.destination.DestinationCode;
import com.surya.performancetests.model.destination.Order;
import com.surya.performancetests.model.source.SourceCode;
import com.surya.performancetests.model.source.SourceOrder;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerConverter implements Converter {
    private final Mapper mapper;

    public DozerConverter() {
        this.mapper = DozerBeanMapperBuilder.create()
            .withMappingFiles("dozer-mapping.xml")
            .build();
    }

    @Override
    public Order convert(SourceOrder sourceOrder) {
        return mapper.map(sourceOrder, Order.class);
    }

    @Override
    public DestinationCode convert(SourceCode sourceCode) {
        return mapper.map(sourceCode, DestinationCode.class);
    }
}
