package com.surya.l.advanced;

public class ToyCar extends Car {

    public ToyCar(int mileage) {
        super(mileage);
    }

    protected void turnOnEngine() {

    }

    protected void accelerate() {

    }

    protected void brake() {

    }

    public void reset() {
        mileage = 0;
    }
}
