package com.surya.asciiart;

import org.junit.Test;

import com.surya.asciiart.AsciiArt;
import com.surya.asciiart.AsciiArt.Settings;

import java.awt.*;

public class AsciiArtIntegrationTest {

    @Test
    public void givenTextWithAsciiCharacterAndSettings_shouldPrintAsciiArt() {
        AsciiArt asciiArt = new AsciiArt();
        String text = "surya";
        Settings settings = asciiArt.new Settings(new Font("SansSerif", Font.BOLD, 24), text.length() * 30, 30); // 30 pixel width per character
        
        asciiArt.drawString(text, "*", settings);
    }
}
