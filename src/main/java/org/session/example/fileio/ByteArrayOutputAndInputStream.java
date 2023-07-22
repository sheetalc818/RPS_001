package org.session.example.fileio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputAndInputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream out1 = new FileOutputStream("FileOutputByteArray1.txt");
        FileOutputStream out2 = new FileOutputStream("FileOutputByteArray2.txt");
        ByteArrayOutputStream bout  = new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(out1);
        bout.writeTo(out2);
        bout.close();

        byte[] array = {35,38,41,44};
        ByteArrayInputStream bin = new ByteArrayInputStream(array);
        int c =0;
        while ((c=bin.read())!=-1){
            char ch = (char)c;
            System.out.println("ASCII Value of char is : "+c+", Special char is : "+ch);
        }
    }
}
