package com.surya.books.events;

import com.surya.books.events.AuthorEventHandler;
import com.surya.books.models.Author;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import static org.mockito.Mockito.mock;

public class AuthorEventHandlerUnitTest {

    @Test
    public void whenCreateAuthorThenSuccess() {
        Author author = mock(Author.class);
        AuthorEventHandler authorEventHandler = new AuthorEventHandler();
        authorEventHandler.handleAuthorBeforeCreate(author);
        Mockito.verify(author, Mockito.times(1)).getName();

    }

    @Test
    public void whenDeleteAuthorThenSuccess() {
        Author author = mock(Author.class);
        AuthorEventHandler authorEventHandler = new AuthorEventHandler();
        authorEventHandler.handleAuthorAfterDelete(author);
        Mockito.verify(author, Mockito.times(1)).getName();

    }
}
