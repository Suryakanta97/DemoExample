package com.surya.util;

import org.testcontainers.containers.PostgreSQLContainer;

public class suryaPostgresqlContainer extends PostgreSQLContainer<suryaPostgresqlContainer> {

    private static final String IMAGE_VERSION = "postgres:11.1";

    private static suryaPostgresqlContainer container;


    private suryaPostgresqlContainer() {
        super(IMAGE_VERSION);
    }

    public static suryaPostgresqlContainer getInstance() {
        if (container == null) {
            container = new suryaPostgresqlContainer();
        }
        return container;
    }

    @Override
    public void start() {
        super.start();
        System.setProperty("DB_URL", container.getJdbcUrl());
        System.setProperty("DB_USERNAME", container.getUsername());
        System.setProperty("DB_PASSWORD", container.getPassword());
    }

    @Override
    public void stop() {
        //do nothing, JVM handles shut down
    }
}
