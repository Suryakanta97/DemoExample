package com.surya.cassandra.reactive.repository;

import com.surya.cassandra.reactive.model.Employee;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import reactor.core.publisher.Flux;

public interface EmployeeRepository extends ReactiveCassandraRepository<Employee, Integer> {
    @AllowFiltering
    Flux<Employee> findByAgeGreaterThan(int age);
}
