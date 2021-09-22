package com.surya.spring.data.couchbase.repos;

import java.util.List;

import com.surya.spring.data.couchbase.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String> {
    List<Person> findByFirstName(String firstName);

    List<Person> findByLastName(String lastName);
}
