package org.practice.problems.day4;

import java.util.Scanner;

public class P3_LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of integers in array:- ");
        int n = sc.nextInt();
        int[] arrayMax = new int[n];

        System.out.println("Enter " + arrayMax.length + " integer values:");

        for (int i = 0; i < arrayMax.length; i++) {
            arrayMax[i] = sc.nextInt();
        }

        int max = arrayMax[0];
        for (int i = 0; i < arrayMax.length; i++) {
            if (arrayMax[i] > max)
                max = arrayMax[i];
        }
        System.out.println("Largest element are: " + max);
    }
}
