package com.surya.easymock;

import java.util.List;

public class suryaReader {

    private ArticleReader articleReader;
    private IArticleWriter articleWriter;

    public suryaReader() {
    }

    ;

    public suryaReader(ArticleReader articleReader) {
        this.articleReader = articleReader;
    }

    public suryaReader(IArticleWriter writer) {
        this.articleWriter = writer;
    }

    public suryaReader(ArticleReader articleReader, IArticleWriter writer) {
        this.articleReader = articleReader;
        this.articleWriter = writer;
    }

    public suryaArticle readNext() {
        return articleReader.next();
    }

    public List<suryaArticle> readTopic(String topic) {
        return articleReader.ofTopic(topic);
    }

    public String write(String title, String content) {
        return articleWriter.write(title, content);
    }

}