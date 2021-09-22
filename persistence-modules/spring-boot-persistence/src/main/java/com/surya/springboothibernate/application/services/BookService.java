package com.surya.springboothibernate.application.services;

import com.surya.springboothibernate.application.models.Book;
import com.surya.springboothibernate.application.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> list() {
        return bookRepository.findAll();
    }
}
