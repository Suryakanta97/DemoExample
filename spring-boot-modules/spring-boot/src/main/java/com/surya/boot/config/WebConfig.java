package com.surya.boot.config;

import com.surya.boot.converter.StringToEmployeeConverter;
import com.surya.boot.converter.StringToEnumConverterFactory;
import com.surya.boot.converter.GenericBigDecimalConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	 
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToEmployeeConverter());
        registry.addConverterFactory(new StringToEnumConverterFactory());
        registry.addConverter(new GenericBigDecimalConverter());
    }
}

