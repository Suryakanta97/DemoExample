package com.surya.spring.drools.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.surya.spring.drools.model.TaxiRide;
import com.surya.spring.drools.model.Fare;
import com.surya.spring.drools.service.TaxiFareCalculatorService;
import com.surya.spring.drools.service.TaxiFareConfiguration;

public class ApplicationRunner {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TaxiFareConfiguration.class);
        TaxiFareCalculatorService taxiFareCalculatorService = (TaxiFareCalculatorService) context.getBean(TaxiFareCalculatorService.class);
        TaxiRide taxiRide = new TaxiRide();
        taxiRide.setIsNightSurcharge(true);
        taxiRide.setDistanceInMile(190L);
        Fare rideFare = new Fare();
        taxiFareCalculatorService.calculateFare(taxiRide, rideFare);
    }

}
