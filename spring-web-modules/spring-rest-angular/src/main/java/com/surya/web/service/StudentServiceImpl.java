package com.surya.web.service;

import com.surya.web.dao.StudentRepository;
import com.surya.web.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository dao;

    @Override
    public Page<Student> findPaginated(int page, int size) {
        return dao.findAll(PageRequest.of(page, size));
    }

}
