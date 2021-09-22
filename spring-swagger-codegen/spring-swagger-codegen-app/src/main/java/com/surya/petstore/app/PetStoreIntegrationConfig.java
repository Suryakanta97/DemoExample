package com.surya.petstore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.surya.petstore.client.api.PetApi;
import com.surya.petstore.client.invoker.ApiClient;

@Configuration
public class PetStoreIntegrationConfig {

    @Bean
    public PetApi petpi() {
        return new PetApi(apiClient());
    }
    
    @Bean
    public ApiClient apiClient() {
        ApiClient apiClient = new ApiClient();
        return apiClient;
    }
    
}
