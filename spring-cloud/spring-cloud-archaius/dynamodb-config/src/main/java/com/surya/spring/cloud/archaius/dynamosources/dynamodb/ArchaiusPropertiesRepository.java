package com.surya.spring.cloud.archaius.dynamosources.dynamodb;

import org.springframework.data.repository.CrudRepository;

public interface ArchaiusPropertiesRepository extends CrudRepository<ArchaiusProperties, String> {

}
