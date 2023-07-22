package org.practice.problems.day3;

import java.util.Scanner;

public class IfElseWriteInNo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = userInput();
        myMethod(a);
    }
    private static int userInput() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter single digit no: ");
        int num = sc.nextInt();
        return num;
    }
    private static void myMethod(int num) {
        // TODO Auto-generated method stub
        if (num == 1) {
            System.out.println("one");
        } else if (num == 2) {
            System.out.println("Two");
        } else if (num == 3) {
            System.out.println("Three");
        } else if (num == 4) {
            System.out.println("Four");
        } else if (num == 5) {
            System.out.println("Five");
        } else if (num == 6) {
            System.out.println("Six");
        } else if (num == 7) {
            System.out.println("Seven");
        } else if (num == 8) {
            System.out.println("Eight");
        } else if (num == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
