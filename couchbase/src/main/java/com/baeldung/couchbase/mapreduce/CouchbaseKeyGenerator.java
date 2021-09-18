package com.surya.couchbase.mapreduce;

public interface CouchbaseKeyGenerator<T> {

    String generateKey(T t);
}
