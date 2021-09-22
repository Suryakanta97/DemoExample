package com.surya.easymock;

import org.easymock.EasyMockRule;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.*;

import java.util.NoSuchElementException;

import static org.easymock.EasyMock.*;

public class suryaReaderAnnotatedWithRuleUnitTest {

    @Rule public EasyMockRule mockRule = new EasyMockRule(this);

    @Mock ArticleReader mockArticleReader;

    @Mock IArticleWriter mockArticleWriter;

    @TestSubject suryaReader suryaReader = new suryaReader();

    @Test
    public void givensuryaReader_whenReadNext_thenNextArticleRead() {
        expect(mockArticleReader.next()).andReturn(null);
        replay(mockArticleReader);
        suryaReader.readNext();
        verify(mockArticleReader);
    }

    @Mock suryaReader mocksuryaReader;

    @Test
    public void givensuryaReader_whenWrite_thenWriterCalled() {
        expect(mockArticleWriter.write("title", "content")).andReturn(null);
        replay(mockArticleWriter);
        suryaReader.write("title", "content");
        verify(mockArticleWriter);
    }

    @Test
    public void givenArticlesInReader_whenReadTillEnd_thenThrowException() {
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

