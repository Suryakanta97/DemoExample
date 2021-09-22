package com.surya.autoconfiguration;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.TestPropertySource;

import com.surya.autoconfiguration.service.CustomService;
import com.surya.autoconfiguration.service.DefaultService;
import com.surya.autoconfiguration.service.SimpleService;

public class ConditionalOnPropertyIntegrationTest {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner();

    @Test
    public void whenGivenCustomPropertyValue_thenCustomServiceCreated() {
        this.contextRunner.withPropertyValues("com.surya.service=custom")
            .withUserConfiguration(SimpleServiceConfiguration.class)
            .run(context -> {
                assertThat(context).hasBean("customService");
                SimpleService simpleService = context.getBean(CustomService.class);
                assertThat(simpleService.serve()).isEqualTo("Custom Service");
                assertThat(context).doesNotHaveBean("defaultService");
            });
    }

    @Test
    public void whenGivenDefaultPropertyValue_thenDefaultServiceCreated() {
        this.contextRunner.withPropertyValues("com.surya.service=default")
            .withUserConfiguration(SimpleServiceConfiguration.class)
            .run(context -> {
                assertThat(context).hasBean("defaultService");
                SimpleService simpleService = context.getBean(DefaultService.class);
                assertThat(simpleService.serve()).isEqualTo("Default Service");
                assertThat(context).doesNotHaveBean("customService");
            });
    }

    @Configuration
    @TestPropertySource("classpath:ConditionalOnPropertyTest.properties")
    protected static class SimpleServiceConfiguration {

        @Bean
        @ConditionalOnProperty(name = "com.surya.service", havingValue = "default")
        @ConditionalOnMissingBean
        public DefaultService defaultService() {
            return new DefaultService();
        }

        @Bean
        @ConditionalOnProperty(name = "com.surya.service", havingValue = "custom")
        @ConditionalOnMissingBean
        public CustomService customService() {
            return new CustomService();
        }
    }

}
