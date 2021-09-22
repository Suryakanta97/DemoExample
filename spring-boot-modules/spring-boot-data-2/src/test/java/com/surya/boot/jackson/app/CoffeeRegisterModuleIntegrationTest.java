package com.surya.boot.jackson.app;

import com.surya.boot.jackson.config.CoffeeRegisterModuleConfig;
import org.springframework.context.annotation.Import;

@Import(CoffeeRegisterModuleConfig.class)
public class CoffeeRegisterModuleIntegrationTest extends AbstractCoffeeIntegrationTest {
}
