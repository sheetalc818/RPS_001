package org.session.example;

import java.util.Scanner;

public class PowerOfTwo {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        powerOfTwo();
        harmonicSeries();
    }

    public static void powerOfTwo(){
        System.out.println("Enter the power(n) of 2 you want to calculate:");
        //Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i =1; i<=n; i++){
            if (i<31)
                System.out.println("2^"+i+"="+(int)Math.pow(2,i));
        }
    }

    public static void harmonicSeries(){
        double result=0.0;
        System.out.println("Enter the no of values u want to print in series:");
        //Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n==0){
            System.out.println("Please enter valid input");
        }else {
            System.out.println("Harmonic series :");
            for (int i=1; i<=n; i++){
                result=result+(double)1/i;
                System.out.println("1/"+i+":"+result+",");
            }
        }
    }
}
