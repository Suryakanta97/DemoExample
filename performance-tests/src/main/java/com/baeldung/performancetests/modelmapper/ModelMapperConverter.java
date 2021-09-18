package com.surya.performancetests.modelmapper;

import com.surya.performancetests.Converter;
import com.surya.performancetests.model.destination.DestinationCode;
import com.surya.performancetests.model.source.SourceCode;
import com.surya.performancetests.model.source.SourceOrder;
import com.surya.performancetests.model.destination.Order;
import org.modelmapper.ModelMapper;

    public class ModelMapperConverter implements Converter {
        private ModelMapper modelMapper;

        public ModelMapperConverter() {
            modelMapper = new ModelMapper();
        }

        @Override
        public Order convert(SourceOrder sourceOrder) {
           return modelMapper.map(sourceOrder, Order.class);
        }

        @Override
        public DestinationCode convert(SourceCode sourceCode) {
            return modelMapper.map(sourceCode, DestinationCode.class);
        }
    }
