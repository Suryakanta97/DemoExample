package com.surya.random;

import org.junit.jupiter.api.RepeatedTest;

import com.surya.random.RandomDateTimes;

import java.time.Duration;
import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;

class RandomDateTimesUnitTest {

    @RepeatedTest(100)
    void givenNoRange_WhenGenTimestamp_ShouldGenerateRandomTimestamps() {
        Instant random = RandomDateTimes.timestamp();

        assertThat(random).isBetween(Instant.MIN, Instant.MAX);
    }

    @RepeatedTest(100)
    void givenARange_WhenGenTimestamp_ShouldBeInRange() {
        Instant hundredYearsAgo = Instant.now().minus(Duration.ofDays(100 * 365));
        Instant tenDaysAgo = Instant.now().minus(Duration.ofDays(10));

        Instant random = RandomDateTimes.between(hundredYearsAgo, tenDaysAgo);
        assertThat(random).isBetween(hundredYearsAgo, tenDaysAgo);
    }
}
