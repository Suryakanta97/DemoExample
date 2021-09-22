package com.surya.kong.domain;

/**
 * @author aiet
 */
public class UpstreamObject {

    public UpstreamObject(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
