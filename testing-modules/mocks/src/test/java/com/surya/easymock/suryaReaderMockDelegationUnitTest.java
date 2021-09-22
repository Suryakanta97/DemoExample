package com.surya.easymock;

import org.easymock.*;
import org.junit.*;

import static org.easymock.EasyMock.*;

public class suryaReaderMockDelegationUnitTest {

    EasyMockSupport easyMockSupport = new EasyMockSupport();

    @Test
    public void givensuryaReader_whenReadAndWriteSequencially_thenWorks() {
        ArticleReader mockArticleReader = easyMockSupport.createMock(ArticleReader.class);
        IArticleWriter mockArticleWriter = easyMockSupport.createMock(IArticleWriter.class);
        suryaReader suryaReader = new suryaReader(mockArticleReader, mockArticleWriter);

        expect(mockArticleReader.next()).andReturn(null);
        expect(mockArticleWriter.write("title", "content")).andReturn("");
        easyMockSupport.replayAll();

        suryaReader.readNext();
        suryaReader.write("title", "content");
        easyMockSupport.verifyAll();
    }

}