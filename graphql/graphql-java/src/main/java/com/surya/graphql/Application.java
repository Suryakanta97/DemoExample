package com.surya.graphql;

import ratpack.server.RatpackServer;

import com.surya.graphql.handler.UserHandler;

public class Application {
    public static void main(String[] args) throws Exception {
        new Application();
    }

    private Application() throws Exception {
        final RatpackServer server = RatpackServer.of(s -> s.handlers(chain -> chain.post("users", new UserHandler())));
        server.start();
    }

}
