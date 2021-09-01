package com.surya.cxf.introduction;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import org.junit.Before;
import org.junit.Test;

public class StudentLiveTest {
    private static QName SERVICE_NAME = new QName("http://introduction.cxf.surya.com/", "surya");
    private static QName PORT_NAME = new QName("http://introduction.cxf.surya.com/", "suryaPort");

    private Service service;
    private surya suryaProxy;
    private suryaImpl suryaImpl;

    {
        service = Service.create(SERVICE_NAME);
        final String endpointAddress = "http://localhost:8080/surya";
        service.addPort(PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING, endpointAddress);
    }

    @Before
    public void reinstantiatesuryaInstances() {
        suryaImpl = new suryaImpl();
        suryaProxy = service.getPort(PORT_NAME, surya.class);
    }

    @Test
    public void whenUsingHelloMethod_thenCorrect() {
        final String endpointResponse = suryaProxy.hello("surya");
        final String localResponse = suryaImpl.hello("surya");
        assertEquals(localResponse, endpointResponse);
    }

    @Test
    public void whenUsingHelloStudentMethod_thenCorrect() {
        final Student student = new StudentImpl("John Doe");
        final String endpointResponse = suryaProxy.helloStudent(student);
        final String localResponse = suryaImpl.helloStudent(student);
        assertEquals(localResponse, endpointResponse);
    }

    @Test
    public void usingGetStudentsMethod_thenCorrect() {
        final Student student1 = new StudentImpl("Adam");
        suryaProxy.helloStudent(student1);

        final Student student2 = new StudentImpl("Eve");
        suryaProxy.helloStudent(student2);

        final Map<Integer, Student> students = suryaProxy.getStudents();
        assertEquals("Adam", students.get(1).getName());
        assertEquals("Eve", students.get(2).getName());
    }
}