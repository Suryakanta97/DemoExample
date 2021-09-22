package com.surya.dddhexagonalspring.infrastracture.configuration;

import com.surya.dddhexagonalspring.DomainLayerApplication;
import com.surya.dddhexagonalspring.domain.repository.OrderRepository;
import com.surya.dddhexagonalspring.domain.service.DomainOrderService;
import com.surya.dddhexagonalspring.domain.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = DomainLayerApplication.class)
public class BeanConfiguration {

    @Bean
    OrderService orderService(final OrderRepository orderRepository) {
        return new DomainOrderService(orderRepository);
    }
}
