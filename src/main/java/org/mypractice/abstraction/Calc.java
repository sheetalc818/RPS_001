package org.mypractice.abstraction;

import java.util.Scanner;

public class Calc extends Operation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two values : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Calc calc = new Calc();
        calc.add(a,b);
        calc.div(a,b);
        calc.mul(a,b);
        calc.sub(a,b);
    }
    @Override
    void add(int x, int y) {
        System.out.println("Add :"+(x+y));
    }

    @Override
    void sub(int x, int y) {
        System.out.println("Sub :"+(x-y));
    }

    @Override
    void div(int x, int y) {
        System.out.println("div: "+(x/y));
    }
}
