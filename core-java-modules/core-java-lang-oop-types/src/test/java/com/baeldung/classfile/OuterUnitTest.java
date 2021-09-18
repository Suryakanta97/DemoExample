package com.surya.classfile;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.surya.classfile.Outer.Nested;

public class OuterUnitTest {

    @Test
    public void when_static_nestedClass_then_verifyOutput() {
        Outer.StaticNested nestedClass = new Outer.StaticNested();
        assertEquals("This is a static Nested Class", nestedClass.message());
    }

    @Test
    public void when_nestedClass_then_verifyOutput() {
        Outer outer = new Outer();
        Nested nestedClass = outer.new Nested();
        assertEquals("This is a non-static Nested Class", nestedClass.message());
    }

    @Test
    public void when_localClass_then_verifyOutput() {
        Outer outer = new Outer();
        assertEquals("This is a Local Class within a method", outer.message());
    }

    @Test
    public void when_localClassInIfClause_then_verifyOutput() {
        Outer outer = new Outer();
        assertEquals("Welcome to surya", outer.message("surya"));
        assertEquals("This is a Local Class within if clause", outer.message(""));
    }

    @Test
    public void when_anonymousClass_then_verifyOutput() {
        Outer outer = new Outer();
        assertEquals("Running Anonymous Class...", outer.greet());
    }

    @Test
    public void when_anonymousClassHelloWorld_then_verifyOutput() {
        Outer outer = new Outer();
        assertEquals("Welcome to surya", outer.greet("surya"));
    }
}