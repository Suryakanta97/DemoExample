package com.surya.spring.service;

import com.surya.spring.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    List<Employee> getEmployeeList();
}
