package org.practice.problems.day6functional;

import java.util.Scanner;

public class FP3_Distance {
    public static void main(String[] args) {
        distanceFormula();
    }
    private static void distanceFormula() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first integer x");
        int x = sc.nextInt();
        System.out.println("Enter the second integer y");
        int y = sc.nextInt();
        double dist = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
}
