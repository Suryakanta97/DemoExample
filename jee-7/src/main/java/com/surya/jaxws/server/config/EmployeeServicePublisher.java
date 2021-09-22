package com.surya.jaxws.server.config;

import javax.xml.ws.Endpoint;

import com.surya.jaxws.server.bottomup.EmployeeServiceImpl;
import com.surya.jaxws.server.topdown.EmployeeServiceTopDownImpl;

public class EmployeeServicePublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/employeeservicetopdown", new EmployeeServiceTopDownImpl());
        Endpoint.publish("http://localhost:8080/employeeservice", new EmployeeServiceImpl());
    }
}
