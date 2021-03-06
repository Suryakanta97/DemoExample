package com.surya.spring.data.couchbase.service;

import java.util.List;

import com.surya.spring.data.couchbase.model.Person;

public interface PersonService {

    Person findOne(String id);

    List<Person> findAll();

    List<Person> findByFirstName(String firstName);

    List<Person> findByLastName(String lastName);

    void create(Person person);

    void update(Person person);

    void delete(Person person);
}
