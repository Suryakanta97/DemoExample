package com.surya.roles.custom.persistence.dao;

import com.surya.roles.custom.persistence.model.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {

    Privilege findByName(String name);
}
