package com.surya.jacksonannotation.general.jsonfilter;

import com.surya.jacksonannotation.domain.Item;
import com.surya.jacksonannotation.domain.Person;
import com.fasterxml.jackson.annotation.JsonFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Source code github.com/eugenp/tutorials
 *
 * @author Alex Theedom www.surya.com
 * @version 1.0
 */
@JsonFilter("authorFilter")
public class Author extends Person {

    private List<Item> items = new ArrayList<>();

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
