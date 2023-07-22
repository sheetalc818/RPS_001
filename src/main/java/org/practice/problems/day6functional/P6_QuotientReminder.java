package org.practice.problems.day6functional;

import java.util.Scanner;

public class P6_QuotientReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the dividend");//10
        int dividend = sc.nextInt();
        System.out.println("Enter the divisor");//2
        int divisor = sc.nextInt();

        int quotient = dividend / divisor ;
        int remainder = dividend % divisor ;
        System.out.println("quotient : "+ quotient);
        System.out.println("remainder : " + remainder );
    }
}
