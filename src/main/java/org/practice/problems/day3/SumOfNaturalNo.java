package org.practice.problems.day3;

import java.util.Scanner;

public class SumOfNaturalNo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        myMethod();
    }
    private static void myMethod() {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        for(i=0;i<=n;i++) {
            sum = sum+i;
        }
        System.out.println("Sum of n Natural Numbers are: "+sum);
    }
}
