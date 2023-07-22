package org.session.example;

import org.session.example.customexception.InvalidAgeException;

public class JavaExceptionDemo {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied!!");
        } else
            System.out.println("Access granted");
    }

    static void tryCatchException(int age){
        if (age<18){
            try {
                throw new InvalidAgeException("Age is not the valid one");
            } catch (InvalidAgeException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        checkAge(20);
        tryCatchException(10);
    }
}
