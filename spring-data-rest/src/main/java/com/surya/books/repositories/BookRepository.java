package com.surya.books.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.surya.books.models.Book;
import com.surya.books.projections.CustomBook;

@RepositoryRestResource(excerptProjection = CustomBook.class)
public interface BookRepository extends CrudRepository<Book, Long> {
}
