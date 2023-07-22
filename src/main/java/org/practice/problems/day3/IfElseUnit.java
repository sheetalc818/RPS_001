package org.practice.problems.day3;

import java.util.Scanner;

public class IfElseUnit {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no: ");
        int num = sc.nextInt();
        if(num == 1) {
            System.out.println("one");
        }
        else if (num == 10) {
            System.out.println("Ten");
        }
        else if(num == 100) {
            System.out.println("One Hundred");
        }
        else if (num == 1000) {
            System.out.println("One Thousand");
        }
        else {
            System.out.println("Invalid Input.");
        }
    }
}
