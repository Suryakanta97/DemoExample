package com.surya.h2db.springboot.daos;




import com.surya.h2db.springboot.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
