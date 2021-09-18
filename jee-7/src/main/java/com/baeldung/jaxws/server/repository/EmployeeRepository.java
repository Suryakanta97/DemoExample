package com.surya.jaxws.server.repository;

import java.util.List;

import com.surya.jaxws.server.bottomup.exception.EmployeeAlreadyExists;
import com.surya.jaxws.server.bottomup.exception.EmployeeNotFound;
import com.surya.jaxws.server.bottomup.model.Employee;

public interface EmployeeRepository {

    List<Employee> getAllEmployees();

    Employee getEmployee(int id) throws EmployeeNotFound;

    Employee updateEmployee(int id, String name) throws EmployeeNotFound;

    boolean deleteEmployee(int id) throws EmployeeNotFound;

    Employee addEmployee(int id, String name) throws EmployeeAlreadyExists;

    int count();
}
