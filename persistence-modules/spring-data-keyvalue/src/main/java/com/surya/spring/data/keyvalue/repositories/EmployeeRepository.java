package com.surya.spring.data.keyvalue.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.surya.spring.data.keyvalue.vo.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}