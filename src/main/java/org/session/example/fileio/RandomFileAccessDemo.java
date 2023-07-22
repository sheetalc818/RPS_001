package org.session.example.fileio;

import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomFileAccessDemo {
    static final String FILEPATH = "src/main/java/org/session/example/fileio/FileReader.txt";
    public static RandomAccessFile file;
    public static void main(String[] args) {
        String data = " Bridgelabz sessions for RandomAccessFile class ";
        System.out.println(new String(readFromFile(FILEPATH,0,20)));
        writeToFile(FILEPATH,data,20);
    }
    private static byte[] readFromFile(String filePath, int position, int size){
        byte[] bytes;
        try {
            file = new RandomAccessFile(filePath,"r");
            file.seek(position);
            bytes = new byte[size];
            file.read(bytes);
            file.close();
            return bytes;
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void writeToFile(String filePath,String data, int position)  {
        try {
            file = new RandomAccessFile(filePath,"rw");
            file.seek(position);
            file.write(data.getBytes());
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
