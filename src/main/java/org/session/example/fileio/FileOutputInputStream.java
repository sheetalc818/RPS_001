package org.session.example.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("src/main/java/org/session/example/fileio/input.txt");
            FileOutputStream out = new FileOutputStream("src/main/java/org/session/example/fileio/FileOutputInputStream.txt");
            //single char read
            int i = in.read();
            System.out.println((char) i);
            out.write(i);
            //whole file reading
            int c=0;
            while ((c=in.read())!=-1){
                System.out.print((char)c);
                //writing the data onto the output file
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
