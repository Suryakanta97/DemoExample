package com.surya.vavr.exception.handling.client;


public interface HttpClient {
    Response call() throws ClientException;
}
