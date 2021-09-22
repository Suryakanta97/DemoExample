package com.surya.projection.repository;

import com.surya.projection.model.Person;
import com.surya.projection.view.PersonDto;
import com.surya.projection.view.PersonView;
import org.springframework.data.repository.Repository;

public interface PersonRepository extends Repository<Person, Long> {
    PersonView findByLastName(String lastName);

    PersonDto findByFirstName(String firstName);

    <T> T findByLastName(String lastName, Class<T> type);
}
