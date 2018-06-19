package com.journal.finalProject;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class JournalFileWriterTest {

    @Test
    public void writeFile() {
        JournalFileWriter journal = new JournalFileWriter();
        Weather weather = new Weather();
        journal.setContent(weather.getWeather());
        journal.WriteFile(journal.getFileName(),journal.getContent());
        assertNotEquals("Default", journal.getContent());
        assertEquals("Default", journal.getFileName());
    }


    @Test
    public void fileNameTest() {
        File file = new  File("fileName" + ".txt");
        System.out.print(file.getPath());
        assertEquals("fileName.txt", file.getName());
    }

    @Test
    public void fileWritingTest() {
        File file = new  File("fileName" + ".txt");
        file.delete();
        boolean b = file.canWrite();
        System.out.print("Can write: " + b);
    }

}