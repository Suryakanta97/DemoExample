package com.surya.arquillian;

import javax.ejb.Stateless;

@Stateless
public class CapsConvertor {
    public ConvertToLowerCase getLowerCase(){
        return new ConvertToLowerCase();
    }
}