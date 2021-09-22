package com.surya.spring.data.redis.queue;

public interface MessagePublisher {

    void publish(final String message);
}
