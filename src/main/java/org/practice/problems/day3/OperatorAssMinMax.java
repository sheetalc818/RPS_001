package org.practice.problems.day3;

import java.util.Scanner;

public class OperatorAssMinMax {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first no: ");
        int a = sc.nextInt();
        System.out.println("Enter second no: ");
        int b = sc.nextInt();
        System.out.println("Enter third no: ");
        int c = sc.nextInt();

        int d,e,f,g;
        d = a+b*c;
        System.out.println("First operation is: "+d);
        e = c+a/b;
        System.out.println("Second Operation is: "+e);
        f = a%b+c;
        System.out.println("Third operation is: "+f);
        g = a*b+c;
        System.out.println("Fourth Operation is: "+g);

        if(d>e && d>f && d>g) {
            System.out.println(d +" This is max.");
        }
        else if(e>d && e>f && e>g) {
            System.out.println(e+" This is max.");
        }
        else if(f>d && f>e && f>g) {
            System.out.println(f+" This is max.");
        }
        else {
            System.out.println(g+" This is max.");
        }

        if(d<e && d<f && d<g) {
            System.out.println(d +" This is min.");
        }
        else if(e<d && e<f && e<g) {
            System.out.println(e+" This is min.");
        }
        else if(f<d && f<e && f<g) {
            System.out.println(f+" This is min.");
        }
        else {
            System.out.println(g+" This is min.");
        }
    }
}
