package com.surya.multipledb.dao.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.multipledb.model.user.Possession;

public interface PossessionRepository extends JpaRepository<Possession, Long> {

}
