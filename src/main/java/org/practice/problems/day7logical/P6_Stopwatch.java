package org.practice.problems.day7logical;

import java.util.Scanner;

public class P6_Stopwatch {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        long start, end;
        double time;
        System.out.println("Type any character to start the stopwatch");
        sc.next().charAt(0);
        start = System.currentTimeMillis();

        System.out.println("Type any character to stop the stopwatch");
        sc.next().charAt(0);
        end = System.currentTimeMillis();
        time = (end - start) / 1000.0;
        System.out.println(time);
    }
}
