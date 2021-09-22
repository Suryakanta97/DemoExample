package com.surya.vavr.exception.handling;

import com.surya.vavr.exception.handling.client.ClientException;
import com.surya.vavr.exception.handling.client.HttpClient;
import com.surya.vavr.exception.handling.client.Response;

public class JavaTryCatch {
    private HttpClient httpClient;

    public JavaTryCatch(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Response getResponse() {
        try {
            return httpClient.call();
        } catch (ClientException e) {
            return null;
        }
    }
}
