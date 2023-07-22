package org.session.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter consoleOutput = new PrintWriter(System.out);
        consoleOutput.printf("Hi welcome to the session!!");
        consoleOutput.flush();
        consoleOutput.close();

        PrintWriter fileOutput = new PrintWriter("fileOutput1.txt");
        fileOutput.println("Hi welcome to the session!!");
        fileOutput.flush();
        fileOutput.close();
    }
}

