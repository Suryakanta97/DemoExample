package com.surya.boot.jsp.service;

import java.util.Collection;

import com.surya.boot.jsp.dto.Book;

public interface BookService {
    Collection<Book> getBooks();

    Book addBook(Book book);
}