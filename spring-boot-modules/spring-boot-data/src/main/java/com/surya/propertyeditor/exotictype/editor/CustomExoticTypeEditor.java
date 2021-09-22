package com.surya.propertyeditor.exotictype.editor;

import java.beans.PropertyEditorSupport;

import com.surya.propertyeditor.exotictype.model.ExoticType;

public class CustomExoticTypeEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        ExoticType exoticType = (ExoticType) getValue();

        return exoticType == null ? "" : exoticType.getName();
    }
    
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        ExoticType exoticType = new ExoticType();
        exoticType.setName(text.toUpperCase());
        
        setValue(exoticType);
    }
}
