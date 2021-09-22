package com.surya.spring.data.couchbase.repos;

import java.util.List;

import com.surya.spring.data.couchbase.model.Student;

public interface CustomStudentRepository {
    List<Student> findByFirstNameStartsWith(String s);
}
