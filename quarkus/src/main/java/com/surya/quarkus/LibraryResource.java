package com.surya.quarkus;

import com.surya.quarkus.model.Book;
import com.surya.quarkus.service.LibraryService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/library")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LibraryResource {

    @Inject
    LibraryService libraryService;

    @GET
    @Path("/book")
    public Set<Book> findBooks(@QueryParam("query") String query) {
        return libraryService.find(query);
    }

}
