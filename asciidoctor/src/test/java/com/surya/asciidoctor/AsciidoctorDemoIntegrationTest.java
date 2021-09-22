package com.surya.asciidoctor;

import org.junit.Assert;
import org.junit.Test;

import com.surya.asciidoctor.AsciidoctorDemo;

public class AsciidoctorDemoIntegrationTest {

    @Test
    public void givenString_whenConverting_thenResultingHTMLCode() {
        final AsciidoctorDemo asciidoctorDemo = new AsciidoctorDemo();
        Assert.assertEquals(asciidoctorDemo.generateHTMLFromString("Hello _surya_!"), "<div class=\"paragraph\">\n<p>Hello <em>surya</em>!</p>\n</div>");
    }
}
