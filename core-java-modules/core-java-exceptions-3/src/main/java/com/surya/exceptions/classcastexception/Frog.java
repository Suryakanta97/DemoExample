package com.surya.exceptions.classcastexception;

public class Frog extends Amphibian {

    @Override
    public String getName() {
        return super.getName() + ": Frog";
    }
}
