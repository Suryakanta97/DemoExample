package com.surya.stringtokenizer;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TokenizerUnitTest {

	private final MyTokenizer myTokenizer = new MyTokenizer();
	private final List<String> expectedTokensForString = Arrays.asList("Welcome", "to", "surya.com");
	private final List<String> expectedTokensForFile = Arrays.asList("1", "IND", "India", "2", "MY", "Malaysia", "3", "AU", "Australia");

	@Test
	public void givenString_thenGetListOfString() {
		String str = "Welcome,to,surya.com";
		List<String> actualTokens = myTokenizer.getTokens(str);
		assertEquals(expectedTokensForString, actualTokens);
	}

	@Test
	public void givenFile_thenGetListOfString() {
		List<String> actualTokens = myTokenizer.getTokensFromFile("data.csv", "|");
		assertEquals(expectedTokensForFile, actualTokens);
	}

}
