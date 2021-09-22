package com.surya.boot.passenger;

import java.util.List;

interface CustomPassengerRepository {

    List<Passenger> findOrderedBySeatNumberLimitedTo(int limit);
}
