package com.surya.boot.jsp.exception;

import com.surya.boot.jsp.dto.Book;
import lombok.Getter;

@Getter
public class DuplicateBookException extends RuntimeException {
    private final Book book;

    public DuplicateBookException(Book book) {
        this.book = book;
    }
}