package org.practice.problems.day4;

public class P9_SortArrayAsc {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arrayAsc = new int[] { 5, 2, 8, 7, 1 };
        int temp = 0;

        System.out.println("Elements of original array: ");
        for (int i = 0; i < arrayAsc.length; i++) {
            System.out.print(arrayAsc[i] + " ");
        }

        for (int i = 0; i < arrayAsc.length; i++) {
            for (int j = i + 1; j < arrayAsc.length; j++) {
                if (arrayAsc[i] > arrayAsc[j]) {
                    temp = arrayAsc[i];
                    arrayAsc[i] = arrayAsc[j];
                    arrayAsc[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arrayAsc.length; i++) {
            System.out.print(arrayAsc[i] + " ");
        }
    }
}
