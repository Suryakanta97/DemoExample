package com.surya.roles.rolesauthorities.persistence;

import com.surya.roles.rolesauthorities.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

    void delete(Role role);

}
