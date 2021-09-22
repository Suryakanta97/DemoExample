package com.surya.importannotation.zoo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.surya.importannotation.animal.AnimalScanConfiguration;

@Configuration
@Import(AnimalScanConfiguration.class)
class ZooApplication {
}
