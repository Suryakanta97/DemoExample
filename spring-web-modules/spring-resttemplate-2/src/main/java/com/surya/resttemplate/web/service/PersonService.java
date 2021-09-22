package com.surya.resttemplate.web.service;

import com.surya.resttemplate.web.dto.Person;

public interface PersonService {

    public Person saveUpdatePerson(Person person);

    public Person findPersonById(Integer id);
}