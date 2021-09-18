package com.surya.student.client;

import com.surya.student.service.StudentService;
import com.surya.student.service.dbimpl.StudentDbService;
import com.surya.student.model.Student;

public class StudentClient {

    public static void main(String[] args) {
        StudentService service = new StudentDbService();
        service.create(new Student());
        service.read("17SS0001");
        service.update(new Student());
        service.delete("17SS0001");
    }
}