package com.surya.vertxspring;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.surya.vertxspring.verticles.ServerVerticle;
import com.surya.vertxspring.verticles.ArticleRecipientVerticle;

import io.vertx.core.Vertx;

@SpringBootApplication
@Configuration
@EnableJpaRepositories("com.surya.vertxspring.repository")
@EntityScan("com.surya.vertxspring.entity")
@ComponentScan(basePackages = { "com.surya" })
public class VertxSpringApplication {

    @Autowired
    private ServerVerticle serverVerticle;

    @Autowired
    private ArticleRecipientVerticle serviceVerticle;

    public static void main(String[] args) {
        SpringApplication.run(VertxSpringApplication.class, args);
    }

    @PostConstruct
    public void deployVerticle() {
        final Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(serverVerticle);
        vertx.deployVerticle(serviceVerticle);
    }
}
