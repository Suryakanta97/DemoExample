package com.surya.component.autoproxying;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RandomInt {
    int min();

    int max();
}
