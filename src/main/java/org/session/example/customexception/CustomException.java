package org.session.example.customexception;

public class CustomException {
    static void validate(int age) throws InvalidAgeException {
        if (age<18){
            throw new InvalidAgeException("Age is not the valid one");
        }else {
            System.out.println("Welcome!!");
        }
    }

    public static void main(String[] args) {
        try {
            validate(23);
        } catch (InvalidAgeException e) {
            System.out.println("Caught the exception : "+e);
        }
    }
}
