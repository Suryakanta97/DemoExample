package com.surya.pattern.hexagonal.persistence;

import com.surya.pattern.hexagonal.domain.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoRepoEx extends MongoRepository<Employee, String> {
}
