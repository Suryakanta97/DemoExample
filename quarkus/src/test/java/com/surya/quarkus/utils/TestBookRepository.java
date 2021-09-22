package com.surya.quarkus.utils;

import com.surya.quarkus.model.Book;
import com.surya.quarkus.repository.BookRepository;

import javax.annotation.PostConstruct;
import javax.annotation.Priority;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

@Priority(1)
@Alternative
@ApplicationScoped
public class TestBookRepository extends BookRepository {

    @PostConstruct
    public void init() {
        persist(new Book("Dune", "Frank Herbert"),
          new Book("Foundation", "Isaac Asimov"));
    }

}
