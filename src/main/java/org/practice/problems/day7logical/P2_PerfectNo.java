package org.practice.problems.day7logical;

import java.util.Scanner;

public class P2_PerfectNo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        {
            long n, sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            n = sc.nextLong();

            int i = 1;
            // executes until the condition becomes false
            while (i <= n / 2) {
                if (n % i == 0) {
                    // calculates the sum of factors
                    sum = sum + i;
                }
                // after each iteration, increments the value of variable i by 1
                i++;
            }
            // compares sum with the number
            if (sum == n) {
                // prints if sum and n are equal
                System.out.println(n + " is a perfect number.");
            } // end of if
            else
                // prints if sum and n are not equal
                System.out.println(n + " is not a perfect number.");
        }
    }
}