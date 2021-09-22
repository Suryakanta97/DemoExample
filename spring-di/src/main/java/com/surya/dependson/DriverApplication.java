package com.surya.dependson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.surya.dependson.config.Config;
import com.surya.dependson.file.processor.FileProcessor;

public class DriverApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        ctx.getBean(FileProcessor.class);
        ctx.close();
    }
}
