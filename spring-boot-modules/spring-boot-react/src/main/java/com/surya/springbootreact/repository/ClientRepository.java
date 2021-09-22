package com.surya.springbootreact.repository;

import com.surya.springbootreact.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
