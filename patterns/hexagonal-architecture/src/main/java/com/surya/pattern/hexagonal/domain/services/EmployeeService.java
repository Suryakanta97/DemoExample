package com.surya.pattern.hexagonal.domain.services;

import com.surya.pattern.hexagonal.domain.model.Employee;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    Employee getEmployee(String employeeId);
}
