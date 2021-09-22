package com.surya.couchbase.domain.repository.n1ql;

import com.surya.couchbase.domain.Person;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.UUID;

@Repository
@N1qlPrimaryIndexed
public interface N1QLPersonRepository extends ReactiveCrudRepository<Person, UUID> {

    Flux<Person> findAllByFirstName(final String firstName);
}
