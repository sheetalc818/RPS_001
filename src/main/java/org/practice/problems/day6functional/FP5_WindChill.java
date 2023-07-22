package org.practice.problems.day6functional;

import java.util.Scanner;

public class FP5_WindChill {
    public static void calculateWindChill() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the temperature in Fahrenheit :");//30
        double temp=sc.nextDouble();
        System.out.println("Enter the windSpeed in miles per hours : ");//40
        double wind = sc.nextDouble();
        if (temp < 50 && wind > 3 && wind < 120) {
            double w = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(wind, 0.16);
            System.out.println("WindSpeed : "+w);
        }
        else {
            System.out.println("Note: the formula is not valid if temp is larger than 50 in absolute value or if v is larger\r\n"
                    + "than 120 or less than 3");
        }
    }
    public static void main(String[] args) {
        calculateWindChill();
    }
}
