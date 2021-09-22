package com.surya.jaxws.server.topdown;

import com.surya.jaxws.server.repository.EmployeeRepository;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(name = "EmployeeServiceTopDown", targetNamespace = "http://topdown.server.jaxws.surya.com/", endpointInterface = "com.surya.jaxws.server.topdown.EmployeeServiceTopDown")
public class EmployeeServiceTopDownImpl implements EmployeeServiceTopDown {

    @Inject private EmployeeRepository employeeRepositoryImpl;

    @WebMethod
    public int countEmployees() {
        return employeeRepositoryImpl.count();
    }
}
