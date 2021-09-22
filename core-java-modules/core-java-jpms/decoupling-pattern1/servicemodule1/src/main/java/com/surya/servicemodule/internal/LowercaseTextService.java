package com.surya.servicemodule.internal;

import com.surya.servicemodule.external.TextService;

public class LowercaseTextService implements TextService {

    @Override
    public String processText(String text) {
        return text.toLowerCase();
    }
    
}
