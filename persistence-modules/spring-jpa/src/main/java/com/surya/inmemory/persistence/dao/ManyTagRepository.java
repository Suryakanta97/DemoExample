package com.surya.inmemory.persistence.dao;

import com.surya.inmemory.persistence.model.ManyTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManyTagRepository extends JpaRepository<ManyTag, Long> {
}
