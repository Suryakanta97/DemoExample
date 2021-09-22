package com.surya.easymock;

import org.easymock.*;
import org.junit.*;
import org.junit.runner.RunWith;

import java.util.NoSuchElementException;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.assertEquals;

@RunWith(EasyMockRunner.class)
public class suryaReaderMockSupportUnitTest extends EasyMockSupport {

    @TestSubject suryaReader suryaReader = new suryaReader();
    @Mock ArticleReader mockArticleReader;
    @Mock IArticleWriter mockArticleWriter;

    @Test
    public void givensuryaReader_whenReadAndWriteSequencially_thenWorks() {
        expect(mockArticleReader.next())
          .andReturn(null)
          .times(2)
          .andThrow(new NoSuchElementException());
        expect(mockArticleWriter.write("title", "content")).andReturn("BAEL-201801");
        replayAll();

        Exception expectedException = null;
        try {
            for (int i = 0; i < 3; i++) {
                suryaReader.readNext();
            }
        } catch (Exception exception) {
            expectedException = exception;
        }
        String articleId = suryaReader.write("title", "content");
        verifyAll();
        assertEquals(NoSuchElementException.class, expectedException.getClass());
        assertEquals("BAEL-201801", articleId);
    }

}