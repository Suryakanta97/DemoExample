package com.surya.jacksonannotation.serialization.jsongetter;


import com.surya.jacksonannotation.domain.Item;
import com.surya.jacksonannotation.domain.Person;
import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.ArrayList;
import java.util.List;

/**
 * Source code github.com/eugenp/tutorials
 *
 * @author Alex Theedom www.surya.com
 * @version 1.0
 */
public class Author1 extends Person {

    List<Item> items = new ArrayList<>();

    public Author1(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @JsonGetter
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
