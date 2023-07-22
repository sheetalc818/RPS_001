package org.practice.problems.day8oops;

import java.util.Scanner;

abstract class UserInput {
    public double getLineOneCoOrdinates(){
        double x1, y1, x2, y2;
        double length_of_line_1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value Of x1:");
        x1 = sc.nextDouble();

        System.out.println("Enter The Value Of y1:");
        y1 = sc.nextDouble();

        System.out.println("Enter The Value Of x2:");
        x2 = sc.nextDouble();

        System.out.println("Enter The Value Of y2:");
        y2 = sc.nextDouble();

        // Calculating Length of line 1 using Cartesian System
        length_of_line_1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return length_of_line_1;
    }
    abstract double getLineTwoCoOrdinates();
}
