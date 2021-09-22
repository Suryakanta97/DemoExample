package com.surya.boot.repository;

import com.surya.boot.domain.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericEntityRepository extends JpaRepository<GenericEntity, Long> {
}
