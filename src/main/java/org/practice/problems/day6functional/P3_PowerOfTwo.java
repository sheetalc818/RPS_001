package org.practice.problems.day6functional;

import java.util.Scanner;

public class P3_PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power of 2 you want to print until :");
        int power = sc.nextInt();
        for (int i = 1; i <= power; i++) {
            System.out.println("2^"+i+"="+(int)Math.pow(2, i));
        }
    }
}
