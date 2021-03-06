package com.surya.componentscan.filter.aspectj;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(includeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ,
        pattern = "com.surya.componentscan.filter.aspectj.* "
                + "&& !(com.surya.componentscan.filter.aspectj.L* "
                + "|| com.surya.componentscan.filter.aspectj.C*)"))
public class ComponentScanAspectJFilterApp {
    public static void main(String[] args) {
    }
}
