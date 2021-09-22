package com.surya.jasperreports.config;

import com.surya.jasperreports.SimpleReportExporter;
import com.surya.jasperreports.SimpleReportFiller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class JasperRerportsSimpleConfig {

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL).addScript("classpath:employee-schema.sql").build();
    }

    @Bean
    public SimpleReportFiller reportFiller() {
        return new SimpleReportFiller();
    }

    @Bean
    public SimpleReportExporter reportExporter() {
        return new SimpleReportExporter();
    }

}
