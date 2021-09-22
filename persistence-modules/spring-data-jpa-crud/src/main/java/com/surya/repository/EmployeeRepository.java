package com.surya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
