package org.practice.problems.day2;

import java.util.Scanner;

public class LineCompare {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Program");
        LineCompare lc = new LineCompare();
        lc.calculateLength();
    }

    public void calculateLength() {
        double x1, y1, x2, y2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value Of x1:");
        x1 = sc.nextDouble();

        System.out.println("Enter The Value Of y1:");
        y1 = sc.nextDouble();

        System.out.println("Enter The Value Of x2:");
        x2 = sc.nextDouble();

        System.out.println("Enter The Value Of y2:");
        y2 = sc.nextDouble();

        double lengthOfLine1 = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("Length Of Line1 Is :" + lengthOfLine1);
    }
}
