package com.surya.command.client;

import com.surya.command.command.OpenTextFileOperation;
import com.surya.command.command.SaveTextFileOperation;
import com.surya.command.command.TextFileOperation;
import com.surya.command.invoker.TextFileOperationExecutor;
import com.surya.command.receiver.TextFile;

public class TextFileApplication {
    
    public static void main(String[] args) {
        
        TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("file2.txt"));
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        System.out.println(textFileOperationExecutor.executeOperation(openTextFileOperation));
        System.out.println(textFileOperationExecutor.executeOperation(saveTextFileOperation));
    }   
}
