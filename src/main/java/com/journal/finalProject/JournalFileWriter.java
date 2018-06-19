package com.journal.finalProject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JournalFileWriter {

//    private String content = "Default";
//    private String fileName = "Default";

    public static void WriteFile(String fileName, String content) {
        try {

            File file = new  File(fileName + ".txt");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("File has been recordered with filename: " + fileName + ".txt" );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public void setFileName(String fileName){
//        this.fileName = fileName;
//    }
//
//    public String getFileName() {
//        return fileName;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public  String getContent(){
//        return content;
//    }
}