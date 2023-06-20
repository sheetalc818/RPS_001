package org.practice.problems.day4;

import java.util.Scanner;

public class P4_SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of integers in array:- ");
        int n = sc.nextInt();
        int[] arrayMIN = new int[n];

        System.out.println("Enter " + arrayMIN.length + " integer values:");

        for (int i = 0; i < arrayMIN.length; i++) {
            arrayMIN[i] = sc.nextInt();
        }

        int minimum = arrayMIN[0];
        for (int i = 0; i < arrayMIN.length; i++) {
            if (arrayMIN[i] < minimum)
                minimum = arrayMIN[i];
        }
        System.out.println("Largest element are: " + minimum);
    }

}
