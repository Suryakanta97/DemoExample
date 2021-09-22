package com.surya.javers;

import com.surya.javers.domain.Address;
import com.surya.javers.domain.Product;
import com.surya.javers.domain.Store;
import com.surya.javers.repo.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringBootJaVersApplication {
    @Autowired
    StoreRepository storeRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJaVersApplication.class, args);
    }

    @EventListener
    public void appReady(ApplicationReadyEvent event) {
        Store store = new Store("surya store", new Address("Some street", 22222));
        for (int i = 1; i < 3; i++) {
            Product product = new Product("Product #" + i, 100 * i);
            store.addProduct(product);
        }
        storeRepository.save(store);
    }
}
