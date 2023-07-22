package org.practice.problems.day13_generics;

public class Uc1_FindMaxInt {
    public static void toPrintMaxInteger(Integer[] inputArray) {
        System.out.println("ELEMENTS IN ARRAY : ");
        for (int element : inputArray) {
            System.out.printf("%s", element);
            System.out.println();
        }
        System.out.println();

        int x;
        int max = inputArray[0];
        System.out.println("MAXIMUM ELEMENT IN ARRAY : ");
        for (int i = 1; i < inputArray.length; i++) {
            if ((inputArray[i].compareTo(max)) > 0) {
                max = inputArray[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("WELCOME TO FIND MAXIMUM PROBLEM USING GENERICS PROGRAM");
        System.out.println("---------------------------------------------------------");

        // Integer array
        Integer[] intarr = { 10, 35, 41, 2, 6 };

        Uc1_FindMaxInt.toPrintMaxInteger(intarr);
    }
}
