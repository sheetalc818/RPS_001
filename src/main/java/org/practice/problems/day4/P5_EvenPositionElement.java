package org.practice.problems.day4;

import java.util.Scanner;

public class P5_EvenPositionElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of integers in array:- ");
        int n = sc.nextInt();
        int[] arrayMin = new int[n];

        System.out.println("Enter " + arrayMin.length + " integer values:");

        for (int i = 0; i < arrayMin.length; i++) {
            arrayMin[i] = sc.nextInt();
        }

        for (int i = 1; i < arrayMin.length; i = i + 2) {
            System.out.println("The element on even position is : ");
            System.out.println(arrayMin[i]);
        }
    }
}
