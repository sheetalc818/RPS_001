package org.session.example.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src/main/java/org/session/example/fileio/FileReader.txt");
            FileWriter writer = new FileWriter("src/main/java/org/session/example/fileio/FileWriter.txt");
            int c=0;
            while ((c=reader.read())!=-1) {
               writer.write(c);
            }
            reader.close();
            writer.close();
            System.out.println("written successfully!!!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
