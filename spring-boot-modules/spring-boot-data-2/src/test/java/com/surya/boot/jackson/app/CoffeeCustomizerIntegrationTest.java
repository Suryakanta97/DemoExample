package com.surya.boot.jackson.app;

import com.surya.boot.jackson.config.CoffeeCustomizerConfig;
import org.springframework.context.annotation.Import;

@Import(CoffeeCustomizerConfig.class)
public class CoffeeCustomizerIntegrationTest extends AbstractCoffeeIntegrationTest {
}
