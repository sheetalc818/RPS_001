package org.practice.problems.day8oops;

import java.util.Scanner;

public class MethodAbstract extends UserInput implements Oops{
    @Override
    double getLineTwoCoOrdinates() {
        int x3, x4, y3, y4;
        double length_of_line_2;

        Scanner sc = new Scanner(System.in);
        // User Input
        System.out.println("Enter the value of x3 : ");
        x3 = sc.nextInt();

        System.out.println("Enter the value of y3 : ");
        y3 = sc.nextInt();

        System.out.println("Enter the value of x4 : ");
        x4 = sc.nextInt();

        System.out.println("Enter the value of y4 : ");
        y4 = sc.nextInt();

        // Calculating Length of line 2 using Cartesian System
        length_of_line_2 = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
        return length_of_line_2;
    }

    @Override
    public void checkLength(double length_of_line_1, double length_of_line_2) {
        /*
         * Checking if the length of both the lines are equal or not.
         */
        if (length_of_line_1 == length_of_line_2) {
            System.out.println("Length of Line1 and Line2 are equal");
        } else {
            System.out.println("Length of Line1 and Line2 are not equal");
        }
    }
    @Override
    public void equalAndCompareTo(double length_of_line_1, double length_of_line_2) {
        String Line_1 = String.valueOf(length_of_line_1);
        String Line_2 = String.valueOf(length_of_line_2);
        /*
         * Checking if the length of both the lines are equal or not.
         */
        if (Line_1.equals(Line_2)) {
            System.out.println("Equals Method : Length of Line1 and Line2 are equal");
        } else {
            System.out.println("Equals Method : Length of Line1 and Line2 are not equal");
        }
        System.out.println("--------------------------------------------------");

        /*
         * Checking if the length of line 1
         * is less than or greater than line 2
         */
        int compare = Line_1.compareTo(Line_2);

        if(compare > 0) {
            System.out.println("compareTo() : Line 1 is greater than Line 2");
        }
        else {
            System.out.println("compareTo() : Line 1 is less than Line 2");
        }
    }
}
