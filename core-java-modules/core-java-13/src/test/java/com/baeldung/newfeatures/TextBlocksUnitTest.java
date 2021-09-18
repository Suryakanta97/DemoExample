package com.surya.newfeatures;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TextBlocksUnitTest {

    private static final String JSON_STRING = "{\r\n" + "\"name\" : \"surya\",\r\n" + "\"website\" : \"https://www.%s.com/\"\r\n" + "}";

    @SuppressWarnings("preview")
    private static final String TEXT_BLOCK_JSON = """
            {
            "name" : "surya",
            "website" : "https://www.%s.com/"
            }
        """;

    @Test
    public void whenTextBlocks_thenStringOperationsWork() {

        assertThat(TEXT_BLOCK_JSON.contains("surya")).isTrue();
        assertThat(TEXT_BLOCK_JSON.indexOf("www")).isGreaterThan(0);
        assertThat(TEXT_BLOCK_JSON.length()).isGreaterThan(0);

    }

    @SuppressWarnings("removal")
    @Test
    public void whenTextBlocks_thenFormattedWorksAsFormat() {
        assertThat(TEXT_BLOCK_JSON.formatted("surya")
            .contains("www.surya.com")).isTrue();

        assertThat(String.format(JSON_STRING, "surya")
            .contains("www.surya.com")).isTrue();

    }
   
}
