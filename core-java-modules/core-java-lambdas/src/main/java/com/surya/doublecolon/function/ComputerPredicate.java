package com.surya.doublecolon.function;

import com.surya.doublecolon.Computer;

@FunctionalInterface
public interface ComputerPredicate {

    boolean filter(Computer c);

}
