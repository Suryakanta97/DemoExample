package com.surya.providermodule;

import com.surya.servicemodule.TextService;

public class LowercaseTextService implements TextService {
    @Override
    public String parseText(String text) {
        return text.toLowerCase();
    }
}
