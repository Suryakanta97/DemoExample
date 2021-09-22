package com.surya.consumermodule;

import com.surya.servicemodule.external.TextService;
import com.surya.servicemodule.external.TextServiceFactory;

public class Application {
    
    public static void main(String args[]) {
        TextService textService = TextServiceFactory.getTextService("lowercase");
        System.out.println(textService.processText("Hello from surya!"));
    }
    
}
