package com.surya.dependson.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import com.surya.dependson.file.processor.FileProcessor;
import com.surya.dependson.file.reader.FileReader;
import com.surya.dependson.file.writer.FileWriter;
import com.surya.dependson.shared.File;

@Configuration
@ComponentScan("com.surya.dependson")
public class Config {
    
    @Autowired
    File file;
    
    @Bean("fileProcessor")
    @DependsOn({"fileReader","fileWriter"})
    @Lazy
    public FileProcessor fileProcessor(){
        return new FileProcessor(file);
    }
    
    @Bean("fileReader")
    public FileReader fileReader(){
        return new FileReader(file);
    }
    
    @Bean("fileWriter")
    public FileWriter fileWriter(){
        return new FileWriter(file);
    }
}
