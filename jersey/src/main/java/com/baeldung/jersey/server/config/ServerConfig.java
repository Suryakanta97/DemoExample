package com.surya.jersey.server.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/*")
public class ServerConfig extends ResourceConfig {

    public ServerConfig() {
        packages("com.surya.jersey.server");
    }

}
