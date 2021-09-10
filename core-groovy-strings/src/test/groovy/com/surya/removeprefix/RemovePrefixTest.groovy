package com.surya.removeprefix

import org.junit.Assert
import org.junit.Test

class RemovePrefixTest {


    @Test
    public void whenCasePrefixIsRemoved_thenReturnTrue() {
        def trimPrefix = {
            it.startsWith('Groovy-') ? it.minus('Groovy-') : it
        }
        
        def actual = trimPrefix("Groovy-Tutorials at surya")
        def expected = "Tutorials at surya"

        Assert.assertEquals(expected, actual)
    }

    @Test
    public void whenPrefixIsRemoved_thenReturnTrue() {

        String prefix = "groovy-"
        String trimPrefix = "Groovy-Tutorials at surya"
        def actual;
        if(trimPrefix.startsWithIgnoreCase(prefix)) {
            actual = trimPrefix.substring(prefix.length())
        }
        
        def expected = "Tutorials at surya"

        Assert.assertEquals(expected, actual)
    }

    @Test
    public void whenPrefixIsRemovedUsingRegex_thenReturnTrue() {

        def regex = ~"^([Gg])roovy-"
        String trimPrefix = "Groovy-Tutorials at surya"
        String actual = trimPrefix - regex
        
        def expected = "Tutorials at surya"

        Assert.assertEquals(expected, actual)
    }

    @Test 
    public void whenPrefixIsRemovedUsingReplaceFirst_thenReturnTrue() {
        def regex = ~"^groovy" 
        String trimPrefix = "groovyTutorials at surya's groovy page" 
        String actual = trimPrefix.replaceFirst(regex, "")
        
        def expected = "Tutorials at surya's groovy page"
        
        Assert.assertEquals(expected, actual)
    }

    @Test
    public void whenPrefixIsRemovedUsingReplaceAll_thenReturnTrue() {

        String trimPrefix = "groovyTutorials at surya groovy"
        String actual = trimPrefix.replaceAll(/^groovy/, "")
        
        def expected = "Tutorials at surya groovy"

        Assert.assertEquals(expected, actual)
    }

}