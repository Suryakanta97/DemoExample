package com.surya.cxf.introduction;

import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@WebService
public interface Surya {
    public String hello(String name);

    public String helloStudent(Student student);

    @XmlJavaTypeAdapter(StudentMapAdapter.class)
    public Map<Integer, Student> getStudents();
}