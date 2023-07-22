package org.practice.problems.day4;

public class P1_PrintArrayElement {
    public static void main(String[] args)
    {
        // Initialize array of random numbers and size
        int[] arr = { 10, 0, 3, 20, 25, 12 };
        System.out.print("Elements of given array are: ");

        // Looping through array by incrementing value of i
        for (int i = 0; i < arr.length; i++) {
            // Print array element present at index i
            System.out.print(arr[i] + " ");
        }
    }
}
