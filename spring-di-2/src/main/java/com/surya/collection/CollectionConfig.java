package com.surya.collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.*;

@Configuration
public class CollectionConfig {

    @Bean
    public CollectionsBean getCollectionsBean() {
        return new CollectionsBean(new HashSet<>(Arrays.asList("John", "Adam", "Harry")));
    }

    @Bean
    public List<String> nameList(){
        return Arrays.asList("John", "Adam", "Harry", null);
    }

    @Bean
    public Map<Integer, String> nameMap(){
        Map<Integer, String>  nameMap = new HashMap<>();
        nameMap.put(1, "John");
        nameMap.put(2, "Adam");
        nameMap.put(3, "Harry");
        return nameMap;
    }

    @Bean
    @Qualifier("CollectionsBean")
    @Order(2)
    public suryaBean getElement() {
        return new suryaBean("John");
    }

    @Bean
    @Order(3)
    public suryaBean getAnotherElement() {
        return new suryaBean("Adam");
    }

    @Bean
    @Order(1)
    public suryaBean getOneMoreElement() {
        return new suryaBean("Harry");
    }
}
