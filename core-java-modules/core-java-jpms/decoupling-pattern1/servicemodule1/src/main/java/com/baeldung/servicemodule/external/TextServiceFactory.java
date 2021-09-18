package com.surya.servicemodule.external;

import com.surya.servicemodule.internal.LowercaseTextService;
import com.surya.servicemodule.internal.UppercaseTextService;

public class TextServiceFactory {
    
    private TextServiceFactory() {}
    
    public static TextService getTextService(String name) {
        return name.equalsIgnoreCase("lowercase") ? new LowercaseTextService(): new UppercaseTextService();
    }
    
}
