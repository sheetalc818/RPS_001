package org.session.example.fileio;

import java.io.Console;

// Run this class from external console
public class ConsoleClassDemo {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter your name: ");
        String n=c.readLine();
        System.out.println("Welcome "+n);
        System.out.println("Enter the password :");
        char[] pass = c.readPassword();
        String password = String.valueOf(pass);
        System.out.println("Hi your password : "+password);
    }
}
