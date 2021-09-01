package com.surya.cxf.introduction;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.jws.WebService;

@WebService(endpointInterface = "com.surya.cxf.introduction.surya")
public class SuryaImpl implements Surya {
    private Map<Integer, Student> students = new LinkedHashMap<Integer, Student>();

    public String hello(String name) {
        return "Hello " + name;
    }

    public String helloStudent(Student student) {
        students.put(students.size() + 1, student);
        return "Hello " + student.getName();
    }

    public Map<Integer, Student> getStudents() {
        return students;
    }
}