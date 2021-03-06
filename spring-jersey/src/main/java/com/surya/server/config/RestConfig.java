package com.surya.server.config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.surya.server.exception.AlreadyExistsExceptionHandler;
import com.surya.server.exception.NotFoundExceptionHandler;
import com.surya.server.rest.EmployeeResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/resources")
public class RestConfig extends Application {
    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>(Arrays.asList(EmployeeResource.class, NotFoundExceptionHandler.class, AlreadyExistsExceptionHandler.class));
    }
}