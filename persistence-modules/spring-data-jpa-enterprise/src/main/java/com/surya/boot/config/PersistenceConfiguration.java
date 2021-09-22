package com.surya.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.surya.boot.services.IBarService;
import com.surya.boot.services.impl.BarSpringDataJpaService;

@Configuration
@Profile("!tc")
@EnableTransactionManagement
@EnableJpaAuditing
public class PersistenceConfiguration {

    @Bean
    public IBarService barSpringDataJpaService() {
        return new BarSpringDataJpaService();
    }

}