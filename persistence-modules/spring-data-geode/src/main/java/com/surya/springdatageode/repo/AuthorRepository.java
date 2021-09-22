package com.surya.springdatageode.repo;

import com.surya.springdatageode.domain.Author;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
