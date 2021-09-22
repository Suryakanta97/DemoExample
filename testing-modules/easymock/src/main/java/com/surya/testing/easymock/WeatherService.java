package com.surya.testing.easymock;

public interface WeatherService {
    void populateTemperature(Location location) throws ServiceUnavailableException;
}
