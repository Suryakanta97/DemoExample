package com.surya.jacksonannotation.deserialization.jsonanysetter;

import com.surya.jacksonannotation.domain.Author;
import com.surya.jacksonannotation.domain.Item;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashMap;
import java.util.Map;

/**
 * Source code github.com/eugenp/tutorials
 *
 * @author Alex Theedom www.surya.com
 * @version 1.0
 * @see JsonAnyGetter
 */
public class Inventory {

    private Map<Author, Item> stock = new HashMap<>();

    private Map<String, Float> countryDeliveryCost = new HashMap<>();

    @JsonIgnore
    public Map<Author, Item> getStock() {
        return stock;
    }

    public Map<String, Float> getCountryDeliveryCost() {
        return countryDeliveryCost;
    }

    @JsonAnySetter
    public void addCountryDeliveryCost(String country, Float cost) {
        countryDeliveryCost.put(country, cost);
    }
}
