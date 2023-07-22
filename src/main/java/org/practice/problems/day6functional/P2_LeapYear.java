package org.practice.problems.day6functional;

import java.util.Scanner;
public class P2_LeapYear {

    public static void main(String[] args) {
        System.out.println("Enter the 4 digit year : ");
        Scanner sc = new Scanner (System.in);
        int year = sc.nextInt();
        leapYear(year);
        ternaryOperatorLeap(year);
    }
    public static void leapYear(int year) {
        if (year<999) {
            System.out.println("error - Enter a 4 digit year");
        }
        else if (year > 9999) {
            System.out.println("error - Enter a 4 digit year");
        }
        else {
            // 1st condition check- It is century leap year
            // 2nd condition check- It is leap year and not century year
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println("The year is a leap year");
            }
            else {
                System.out.println("The year is not a leap year");
            }
        }
    }
    public static void ternaryOperatorLeap(int year){
        //Ternary Operator
        boolean is_leap_year = false;
        is_leap_year = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true : false;
        if (is_leap_year)
            System.out.println(year + " : Leap-year");
        else
            System.out.println(year + " : Non Leap-year");
    }
}
