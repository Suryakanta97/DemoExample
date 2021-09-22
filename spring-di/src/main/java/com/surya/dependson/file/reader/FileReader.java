package com.surya.dependson.file.reader;

import com.surya.dependson.shared.File;

public class FileReader {

    public FileReader(File file) {
        file.setText("read");
    }
    
    public void readFile() {}
}
