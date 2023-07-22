package org.practice.problems.day4;

public class P7_OddPositionArrayElement {
    public static void main(String[] args) {

        int[] arrayOdd = new int[] { 1, 2, 3, 4, 5 };
        System.out.println("Elements of given array present on odd position: ");
        for (int i = 0; i < arrayOdd.length; i = i + 2) {
            System.out.println(arrayOdd[i]);
        }
    }
}
