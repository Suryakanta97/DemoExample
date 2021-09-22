package com.surya.web.dao;

import com.surya.web.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> 
{

}
