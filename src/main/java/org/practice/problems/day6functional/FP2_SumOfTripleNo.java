package org.practice.problems.day6functional;

import java.util.Scanner;

public class FP2_SumOfTripleNo {
    public static void main(String[] args) {
        display();
    }
    private static void display() {
        Scanner sc = new Scanner(System.in);
        int arraySize;
        System.out.println("Enter the size of array : ");//5
        arraySize = sc.nextInt();

        int[] arr = new int[arraySize];
        System.out.println();
        System.out.println("Enter the array elements : "); //{0, -1, 2, -3, 1}
        for (int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arraySize-2; i++) {
            for (int j = i + 1; j < arraySize-1; j++) {
                for (int k = j + 1; k < arraySize; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        count = count + 1;
                        System.out.println("The Triplet is : " + arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
        System.out.println();
        System.out.println("The count of triplet is : " + count);
    }
}
