package com.surya.easymock;

import org.junit.*;

import java.util.NoSuchElementException;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.assertEquals;

public class suryaReaderUnitTest {

    private suryaReader suryaReader;

    private ArticleReader mockArticleReader;

    private IArticleWriter mockArticleWriter;

    @Test
    public void givensuryaReader_whenReadNext_thenNextArticleRead() {
        mockArticleReader = mock(ArticleReader.class);
        suryaReader = new suryaReader(mockArticleReader);

        expect(mockArticleReader.next()).andReturn(null);
        replay(mockArticleReader);

        suryaArticle article = suryaReader.readNext();
        verify(mockArticleReader);
        assertEquals(null, article);
    }

    @Test
    public void givensuryaReader_whenReadNextAndSkimTopics_thenAllAllowed() {
        mockArticleReader = strictMock(ArticleReader.class);
        suryaReader = new suryaReader(mockArticleReader);

        expect(mockArticleReader.next()).andReturn(null);
        expect(mockArticleReader.ofTopic("easymock")).andReturn(null);
        replay(mockArticleReader);

        suryaReader.readNext();
        suryaReader.readTopic("easymock");
        verify(mockArticleReader);
    }

    @Test
    public void givensuryaReader_whenReadNextAndOthers_thenAllowed() {
        mockArticleReader = niceMock(ArticleReader.class);
        suryaReader = new suryaReader(mockArticleReader);

        expect(mockArticleReader.next()).andReturn(null);
        replay(mockArticleReader);

        suryaReader.readNext();
        suryaReader.readTopic("easymock");
        verify(mockArticleReader);
    }

    @Test
    public void givensuryaReader_whenWriteMaliciousContent_thenArgumentIllegal() {
        mockArticleWriter = mock(IArticleWriter.class);
        suryaReader = new suryaReader(mockArticleWriter);
        expect(mockArticleWriter.write("easymock", "<body onload=alert('surya')>")).andThrow(new IllegalArgumentException());
        replay(mockArticleWriter);

        Exception expectedException = null;
        try {
            suryaReader.write("easymock", "<body onload=alert('surya')>");
        } catch (Exception exception) {
            expectedException = exception;
        }

        verify(mockArticleWriter);
        assertEquals(IllegalArgumentException.class, expectedException.getClass());
    }

    @Test
    public void givensuryaReader_whenWrite_thenWriterCalled() {
        mockArticleWriter = mock(IArticleWriter.class);
        suryaReader = new suryaReader(mockArticleWriter);
        expect(mockArticleWriter.write("title", "content")).andReturn(null);
        replay(mockArticleWriter);
        String articleId = suryaReader.write("title", "content");
        verify(mockArticleWriter);
        assertEquals(null, articleId);
    }

    @Test
    public void givenArticlesInReader_whenReadTillEnd_thenThrowException() {
        ArticleReader mockArticleReader = mock(ArticleReader.class);
        suryaReader = new suryaReader(mockArticleReader);
        expect(mockArticleReader.next())
          .andReturn(null)
          .times(2)
          .andThrow(new NoSuchElementException());
        replay(mockArticleReader);
        try {
            for (int i = 0; i < 3; i++) {
                suryaReader.readNext();
            }
        } catch (Exception ignored) {
        }
        verify(mockArticleReader);
    }

}