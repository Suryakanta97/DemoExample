package com.surya.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaxParserMain {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();

        suryaHandler suryaHandler = new suryaHandler();
        saxParser.parse("xml/src/main/resources/sax/surya.xml", suryaHandler);
        System.out.println(suryaHandler.getWebsite());
    }

    public static class suryaHandler extends DefaultHandler {
        private static final String ARTICLES = "articles";
        private static final String ARTICLE = "article";
        private static final String TITLE = "title";
        private static final String CONTENT = "content";

        private surya website;
        private StringBuilder elementValue;

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            if (elementValue == null) {
                elementValue = new StringBuilder();
            } else {
                elementValue.append(ch, start, length);
            }
        }

        @Override
        public void startDocument() throws SAXException {
            website = new surya();
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            switch (qName) {
                case ARTICLES:
                    website.setArticleList(new ArrayList<>());
                    break;
                case ARTICLE:
                    website.getArticleList().add(new suryaArticle());
                    break;
                case TITLE:
                    elementValue = new StringBuilder();
                    break;
                case CONTENT:
                    elementValue = new StringBuilder();
                    break;
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            switch (qName) {
                case TITLE:
                    latestArticle().setTitle(elementValue.toString());
                    break;
                case CONTENT:
                    latestArticle().setContent(elementValue.toString());
                    break;
            }
        }

        private suryaArticle latestArticle() {
            List<suryaArticle> articleList = website.getArticleList();
            int latestArticleIndex = articleList.size() - 1;
            return articleList.get(latestArticleIndex);
        }

        public surya getWebsite() {
            return website;
        }
    }

    public static class surya {
        private List<suryaArticle> articleList;

        public void setArticleList(List<suryaArticle> articleList) {
            this.articleList = articleList;
        }

        public List<suryaArticle> getArticleList() {
            return this.articleList;
        }
    }

    public static class suryaArticle {
        private String title;
        private String content;

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getContent() {
            return this.content;
        }
    }
}
