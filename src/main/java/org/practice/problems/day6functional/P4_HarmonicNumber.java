package org.practice.problems.day6functional;

import java.util.Scanner;

public class P4_HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values you want in the series:");
        int n= sc.nextInt();
        double result = 0.0;
        if(n==0){
            System.out.println("Enter valid n value");
        }
        else {
            System.out.println("The harmonic series is :");
            for (int i = 1; i <= n; i++) {
                result = result + (double)1 / i;
                System.out.println("1/"+ i+ ": " +result + ", ");
            }
        }
    }
}
