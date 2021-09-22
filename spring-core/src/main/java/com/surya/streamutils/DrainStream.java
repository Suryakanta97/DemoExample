package com.surya.streamutils;

import java.io.InputStream;

import org.springframework.util.StreamUtils;

public class DrainStream {
    public InputStream getInputStream() {
        return StreamUtils.emptyInput();
    }
}
