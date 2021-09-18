package com.surya.abstractclasses;

import com.surya.abstractclasses.filereaders.BaseFileReader;
import com.surya.abstractclasses.filereaders.UppercaseFileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class UppercaseFileReaderUnitTest {

    @Test
    public void givenUppercaseFileReaderInstance_whenCalledreadFile_thenCorrect() throws Exception {
        Path path = Paths.get(getClass().getClassLoader().getResource("files/test.txt").toURI());
        BaseFileReader uppercaseFileReader = new UppercaseFileReader(path);
        
        assertThat(uppercaseFileReader.readFile()).isInstanceOf(List.class);
    }    
}
