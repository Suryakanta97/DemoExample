package com.surya.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// @Configuration
@EnableTransactionManagement
@ComponentScan({ "com.surya.persistence.dao", "com.surya.persistence.service" })
@ImportResource({ "classpath:persistenceConfig.xml" })
public class PersistenceXmlConfig {

    public PersistenceXmlConfig() {
        super();
    }

}