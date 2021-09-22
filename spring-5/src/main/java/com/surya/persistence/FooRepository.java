package com.surya.persistence;

import com.surya.web.Foo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FooRepository extends JpaRepository<Foo, Long>, JpaSpecificationExecutor<Foo> {

}
