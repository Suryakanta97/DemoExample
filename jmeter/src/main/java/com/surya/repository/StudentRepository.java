package com.surya.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.surya.domain.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
}
