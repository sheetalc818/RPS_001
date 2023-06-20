package org.practice.problems.day3;

import java.util.Scanner;

public class OperatorSprint {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("Month :");
        Scanner sc = new Scanner(System.in);
        int Month = sc.nextInt();

        System.out.println("Day :");
        int Day = sc.nextInt();

        boolean isSpring =  (Month == 3 && Day >= 20 && Day <= 31)
                || (Month == 4 && Day >=  1 && Day <= 30)
                || (Month == 5 && Day >=  1 && Day <= 31)
                || (Month == 6 && Day >=  1 && Day <= 20);

        System.out.println(isSpring);
    }
}
