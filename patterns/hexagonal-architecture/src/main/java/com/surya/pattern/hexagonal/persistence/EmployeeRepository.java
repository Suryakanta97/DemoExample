package com.surya.pattern.hexagonal.persistence;

import com.surya.pattern.hexagonal.domain.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository {

    Employee add(Employee employee);

    Optional<Employee> findById(String id);

}
