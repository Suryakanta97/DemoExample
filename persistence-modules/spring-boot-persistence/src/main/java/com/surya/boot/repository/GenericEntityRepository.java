package com.surya.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.boot.domain.GenericEntity;

public interface GenericEntityRepository extends JpaRepository<GenericEntity, Long> {
}
