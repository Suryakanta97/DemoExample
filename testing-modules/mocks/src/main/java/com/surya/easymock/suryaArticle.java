package com.surya.easymock;

public class suryaArticle {

    public static suryaArticle simpleArticle(String title, String content) {
        return new suryaArticle(title, content);
    }

    private String title;
    private String content;

    private suryaArticle(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String title() {
        return this.title;
    }

    public String content() {
        return this.content;
    }

}