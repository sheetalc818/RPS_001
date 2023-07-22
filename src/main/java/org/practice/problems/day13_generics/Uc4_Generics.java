package org.practice.problems.day13_generics;

public class Uc4_Generics {
    /*
     * Implementing maximum problem
     * using Generics
     */
    public static <E extends Comparable<E>> E toPrintMaxGenerics(E[] inputArray) {
        System.out.println("ELEMENTS IN ARRAY : ");

        for (E element : inputArray) {
            System.out.printf("%s", element);
            System.out.println();
        }
        System.out.println();


        E max = inputArray[0];
        System.out.println("MAXIMUM ELEMENT IN ARRAY : ");
        for (int i = 1; i < inputArray.length; i++) {
            /*
             * Using compareTo method
             * to find maximum element
             * in array
             */
            if (inputArray[i].compareTo(max) > 0) {
                max = inputArray[i];
            }
        }
        System.out.println(max);
        System.out.println("---------------------------------------------------------");
        return max;

    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("WELCOME TO FIND MAXIMUM PROBLEM USING GENERICS PROGRAM");
        System.out.println("---------------------------------------------------------");

        // Integer array
        Integer[] intArr = { 10, 35, 41, 2, 6 };
        Uc4_Generics.toPrintMaxGenerics(intArr);

        // Double array
        Double[] doubleArr = { 12.4, 54.3, 64.0, 2.4, 25.7 };
        Uc4_Generics.toPrintMaxGenerics(doubleArr);

        // String array
        String[] stringArr = { "Apple", "Mango", "Banana", "Orange", "Pineapple" };
        Uc4_Generics.toPrintMaxGenerics(stringArr);
    }
}
