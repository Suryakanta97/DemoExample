package com.surya.boot.jackson.app;

import com.surya.boot.jackson.config.CoffeeJacksonBuilderConfig;
import org.springframework.context.annotation.Import;

@Import(CoffeeJacksonBuilderConfig.class)
public class CoffeeJacksonBuilderIntegrationTest extends AbstractCoffeeIntegrationTest {
}
