package org.practice.problems.day6functional;

import java.util.Scanner;

public class P7_SwapNo {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the first number");
    int num_1 = sc.nextInt();
    System.out.println("Enter the second number");
    int num_2 = sc.nextInt();
    System.out.println("The original numbers are :" + num_1 + " and " + num_2 );

    num_1=num_1+num_2; //5+3 = 8
    num_2=num_1-num_2; // 8-3 = 5
    num_1=num_1-num_2; // 8-5 = 3
    System.out.println("The swapped numbers are : " + num_1 + " and " + num_2 );
  }
}
