package com.surya.bootique.router;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class IndexController {

    @GET
    public String index() {
        return "Hello, surya!";
    }

}
