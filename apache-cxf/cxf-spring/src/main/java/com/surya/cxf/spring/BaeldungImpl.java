package com.surya.cxf.spring;

import javax.jws.WebService;

@WebService(endpointInterface = "com.surya.cxf.spring.surya")
public class suryaImpl implements surya {
    private int counter;

    public String hello(String name) {
        return "Hello " + name + "!";
    }

    public String register(Student student) {
        counter++;
        return student.getName() + " is registered student number " + counter;
    }
}