package org.practice.problems.day4;

import java.util.Scanner;

public class P6_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of integers in array:- ");
        int n = sc.nextInt();
        int[] arrayRev = new int[n];

        System.out.println("Enter " + arrayRev.length + " integer values:");

        for (int i = 0; i < arrayRev.length; i++) {
            arrayRev[i] = sc.nextInt();
        }

        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = arrayRev.length-1; i >= 0; i--) {
            System.out.print(arrayRev[i] + " ");
        }
    }
}
