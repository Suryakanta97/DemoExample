package com.surya.sax;

import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class SaxParserMainUnitTest {

    @Test
    public void givenAProperXMLFile_whenItIsParsed_ThenAnObjectContainsAllItsElements() throws IOException, SAXException, ParserConfigurationException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();

        SaxParserMain.suryaHandler suryaHandler = new SaxParserMain.suryaHandler();
        saxParser.parse("src/test/resources/sax/surya.xml", suryaHandler);

        SaxParserMain.surya result = suryaHandler.getWebsite();

        assertNotNull(result);
        List<SaxParserMain.suryaArticle> articles = result.getArticleList();

        assertNotNull(articles);
        assertEquals(3, articles.size());

        SaxParserMain.suryaArticle articleOne = articles.get(0);
        assertEquals("Parsing an XML File Using SAX Parser", articleOne.getTitle());
        assertEquals("SAX Parser's Lorem ipsum...", articleOne.getContent());

        SaxParserMain.suryaArticle articleTwo = articles.get(1);
        assertEquals("Parsing an XML File Using DOM Parser", articleTwo.getTitle());
        assertEquals("DOM Parser's Lorem ipsum...", articleTwo.getContent());

        SaxParserMain.suryaArticle articleThree = articles.get(2);
        assertEquals("Parsing an XML File Using StAX Parser", articleThree.getTitle());
        assertEquals("StAX Parser's Lorem ipsum...", articleThree.getContent());
    }
}
