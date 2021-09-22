package com.surya;

public class RatpackGroovyApp {

    public static void main(String[] args) {
        File file = new File("src/main/groovy/com/surya/Ratpack.groovy");
        def shell = new GroovyShell()  
        shell.evaluate(file)
    }
    
}

