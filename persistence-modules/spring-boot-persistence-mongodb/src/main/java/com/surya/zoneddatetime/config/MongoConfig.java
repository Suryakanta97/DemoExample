package com.surya.zoneddatetime.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.surya.zoneddatetime.converter.ZonedDateTimeReadConverter;
import com.surya.zoneddatetime.converter.ZonedDateTimeWriteConverter;

@EnableMongoRepositories(basePackages = { "com.surya" })
public class MongoConfig extends AbstractMongoClientConfiguration {

    private final List<Converter<?, ?>> converters = new ArrayList<Converter<?, ?>>();

    @Override
    protected String getDatabaseName() {
        return "test";
    }

    @Override
    public MongoCustomConversions customConversions() {
        converters.add(new ZonedDateTimeReadConverter());
        converters.add(new ZonedDateTimeWriteConverter());
        return new MongoCustomConversions(converters);
    }

}
