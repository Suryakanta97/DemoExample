package com.surya.boot.jsp.repository;

import java.util.Collection;
import java.util.Optional;

import com.surya.boot.jsp.repository.model.BookData;

public interface BookRepository {
    Collection<BookData> findAll();

    Optional<BookData> findById(String isbn);

    BookData add(BookData book);
}
