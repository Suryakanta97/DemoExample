package com.surya.boot.daos.user;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import com.surya.boot.domain.User;

public interface UserRepositoryCustom {
    List<User> findUserByEmails(Set<String> emails);
    
    List<User> findAllUsersByPredicates(Collection<Predicate<User>> predicates);
}
