package com.surya.repository;

import com.surya.model.Employee;
import ratpack.exec.Promise;

public interface EmployeeRepository {

    Promise<Employee> findEmployeeById(Long id) throws Exception;

}
