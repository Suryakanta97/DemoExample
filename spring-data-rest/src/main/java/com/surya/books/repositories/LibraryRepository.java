package com.surya.books.repositories;

import org.springframework.data.repository.CrudRepository;

import com.surya.books.models.Library;

public interface LibraryRepository extends CrudRepository<Library, Long> {

}
