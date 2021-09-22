package com.surya.couchbase.domain.repository.n1ql;

import com.surya.couchbase.domain.Person;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@N1qlPrimaryIndexed
public interface N1QLSortingPersonRepository extends ReactiveSortingRepository<Person, UUID> {
}
