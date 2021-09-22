package com.surya.books.repositories;

import org.springframework.data.repository.CrudRepository;

import com.surya.books.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
