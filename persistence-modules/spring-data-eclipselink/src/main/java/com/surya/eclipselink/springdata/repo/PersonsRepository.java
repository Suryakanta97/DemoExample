package com.surya.eclipselink.springdata.repo;

import org.springframework.data.repository.CrudRepository;

import com.surya.eclipselink.springdata.model.Person;

/**
 * Created by adam.
 */
public interface PersonsRepository extends CrudRepository<Person, Long> {

    Person findByFirstName(String firstName);

}
