package org.practice.problems.day3;

import java.util.Scanner;

public class WhileReverseNo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no: ");
        int num = sc.nextInt();
        int rev=0;
        while( num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("The Reverse No is: " +rev);
    }
}
