package com.surya.filenamewithoutextension;

import com.google.common.io.Files;
import org.apache.commons.io.FilenameUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FileNameDelExtensionUnitTest {

    @Test
    public void givenDotFileWithoutExt_whenCallGuavaMethod_thenCannotGetDesiredResult() {
        //negative assertion
        assertNotEquals(".surya", Files.getNameWithoutExtension(".surya"));
    }

    @Test
    public void givenFileWithoutMultipleExt_whenCallGuavaMethod_thenCannotRemoveAllExtensions() {
        //negative assertion
        assertNotEquals("surya", Files.getNameWithoutExtension("surya.tar.gz"));
    }

    @Test
    public void givenDotFileWithoutExt_whenCallApacheCommonsMethod_thenCannotGetDesiredResult() {
        //negative assertion
        assertNotEquals(".surya", FilenameUtils.removeExtension(".surya"));
    }

    @Test
    public void givenFileWithoutMultipleExt_whenCallApacheCommonsMethod_thenCannotRemoveAllExtensions() {
        //negative assertion
        assertNotEquals("surya", FilenameUtils.removeExtension("surya.tar.gz"));
    }

    @Test
    public void givenFilenameNoExt_whenCallFilenameUtilMethod_thenGetExpectedFilename() {
        assertEquals("surya", MyFilenameUtil.removeFileExtension("surya", true));
        assertEquals("surya", MyFilenameUtil.removeFileExtension("surya", false));
    }

    @Test
    public void givenSingleExt_whenCallFilenameUtilMethod_thenGetExpectedFilename() {
        assertEquals("surya", MyFilenameUtil.removeFileExtension("surya.txt", true));
        assertEquals("surya", MyFilenameUtil.removeFileExtension("surya.txt", false));
    }


    @Test
    public void givenDotFile_whenCallFilenameUtilMethod_thenGetExpectedFilename() {
        assertEquals(".surya", MyFilenameUtil.removeFileExtension(".surya", true));
        assertEquals(".surya", MyFilenameUtil.removeFileExtension(".surya", false));
    }

    @Test
    public void givenDotFileWithExt_whenCallFilenameUtilMethod_thenGetExpectedFilename() {
        assertEquals(".surya", MyFilenameUtil.removeFileExtension(".surya.conf", true));
        assertEquals(".surya", MyFilenameUtil.removeFileExtension(".surya.conf", false));
    }

    @Test
    public void givenDoubleExt_whenCallFilenameUtilMethod_thenGetExpectedFilename() {
        assertEquals("surya", MyFilenameUtil.removeFileExtension("surya.tar.gz", true));
        assertEquals("surya.tar", MyFilenameUtil.removeFileExtension("surya.tar.gz", false));
    }

    @Test
    public void givenDotFileWithDoubleExt_whenCallFilenameUtilMethod_thenGetExpectedFilename() {
        assertEquals(".surya", MyFilenameUtil.removeFileExtension(".surya.conf.bak", true));
        assertEquals(".surya.conf", MyFilenameUtil.removeFileExtension(".surya.conf.bak", false));
    }
}
