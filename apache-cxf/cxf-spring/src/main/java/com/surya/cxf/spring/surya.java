package com.surya.cxf.spring;

import javax.jws.WebService;

@WebService
public interface surya {
    String hello(String name);

    String register(Student student);
}