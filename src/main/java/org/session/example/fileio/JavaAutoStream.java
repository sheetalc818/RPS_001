package org.session.example.fileio;

import java.io.IOException;

public class JavaAutoStream {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!!");
        System.out.println("Enter Value : ");
        int  i = System.in.read();//35 #
        System.out.println((char) i);
        System.err.println("Error message!!");
    }
}
