package com.surya.easymock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ArticleReader {

    private List<suryaArticle> articles;
    private Iterator<suryaArticle> articleIter;

    public ArticleReader() {
        this(new ArrayList<>());
    }

    public ArticleReader(List<suryaArticle> articles) {
        this.articles = articles;
        this.articleIter = this.articles.iterator();
    }

    public List<suryaArticle> ofTopic(String topic) {
        return articles
          .stream()
          .filter(article -> article
            .title()
            .contains(topic))
          .collect(toList());
    }

    public suryaArticle next() {
        return this.articleIter.next();
    }

}