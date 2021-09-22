package com.surya.springboothibernate.application.repositories;

import com.surya.springboothibernate.application.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
