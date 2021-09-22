package com.surya.dependson.file.processor;

import org.springframework.beans.factory.annotation.Autowired;

import com.surya.dependson.file.reader.FileReader;
import com.surya.dependson.file.writer.FileWriter;
import com.surya.dependson.shared.File;

public class FileProcessor {

    File file;
      
    public FileProcessor(File file){
        this.file = file;
        if(file.getText().contains("write") && file.getText().contains("read")){
            file.setText("processed");
        }
    }  
}