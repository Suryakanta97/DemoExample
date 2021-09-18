package com.surya.inheritancecomposition;

import com.surya.inheritancecomposition.model.Actress;
import com.surya.inheritancecomposition.model.Person;
import com.surya.inheritancecomposition.model.Waitress;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InheritanceUnitTest {
    
    @Test
    public void givenWaitressInstance_whenCheckedType_thenIsInstanceOfPerson() {
        assertThat(new Waitress("Mary", "mary@domain.com", 22)).isInstanceOf(Person.class);
    }
    
    @Test
    public void givenActressInstance_whenCheckedType_thenIsInstanceOfPerson() {
        assertThat(new Actress("Susan", "susan@domain.com", 30)).isInstanceOf(Person.class);
    }
}
