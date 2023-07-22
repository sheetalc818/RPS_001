package org.session.example;

import java.util.Scanner;

public class LeapYear {
    public static void checkLeapYear(){
        boolean isLeapYear=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 digit year:");
        int year = scanner.nextInt();

        isLeapYear = (year%4==0 && year %100 !=0 || year%400 ==0) ? true : false;
        if (isLeapYear)
            System.out.println(year + " is the leap year");
        else
            System.out.println(year + " is not a leap year");
    }
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        leapYear.checkLeapYear();
    }
}
