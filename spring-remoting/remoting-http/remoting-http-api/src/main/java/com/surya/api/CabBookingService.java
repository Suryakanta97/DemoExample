package com.surya.api;

public interface CabBookingService {
    Booking bookRide(String pickUpLocation) throws BookingException;
}
