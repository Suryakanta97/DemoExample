package com.surya.javac;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.PARAMETER})
public @interface Positive {
}
