package org.practice.problems.day6functional;

import java.util.Scanner;

public class P5_Factors {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = sc.nextInt();

        for(int i = 2; i< number; i++) {
            while(number%i == 0) { // 4%2=0, 2%2=0,
                System.out.println(i+" "); //2, 2
                number = number/i; // 4/2 = num=2, 2/2=0
            }
        }
        if(number>2) {
            System.out.println(number);
        }
    }
}
