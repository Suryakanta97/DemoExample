package com.surya.templatemethod.application;

import com.surya.templatemethod.model.Computer;
import com.surya.templatemethod.model.ComputerBuilder;
import com.surya.templatemethod.model.HighEndComputerBuilder;
import com.surya.templatemethod.model.StandardComputerBuilder;

public class Application {
    
    public static void main(String[] args) {
        ComputerBuilder standardComputerBuilder = new StandardComputerBuilder();
        Computer standardComputer = standardComputerBuilder.buildComputer();
        standardComputer.getComputerParts().forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));
        
        ComputerBuilder highEndComputerBuilder = new HighEndComputerBuilder();
        Computer highEndComputer = highEndComputerBuilder.buildComputer();
        highEndComputer.getComputerParts().forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));
    }
}
