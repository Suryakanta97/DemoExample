package com.surya.spring.data.redis.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.surya.spring.data.redis.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {}
