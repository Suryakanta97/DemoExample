package com.surya.annotation;

import org.junit.Test;

import com.surya.annotation.Person;

import static org.junit.Assert.assertEquals;

public class PersonBuilderUnitTest {

    @Test
    public void whenBuildPersonWithBuilder_thenObjectHasPropertyValues() {

        Person person = new PersonBuilder().setAge(25).setName("John").build();

        assertEquals(25, person.getAge());
        assertEquals("John", person.getName());

    }

}
