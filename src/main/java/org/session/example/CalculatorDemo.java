package org.session.example;

import java.util.Scanner;

public class CalculatorDemo extends CalcDemo {
    private static int a,b;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to perform calculation:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        CalculatorDemo calculatorDemo = new CalculatorDemo();
        calculatorDemo.add(a,b);
        calculatorDemo.div(a,b);
        calculatorDemo.mul(a,b);
        calculatorDemo.sub(a,b);
        calculatorDemo.add1(2.0,3.3);
        calculatorDemo.add1(2,3);
        calculatorDemo.add1(2,3,4);
    }

    public void add1(int a, int b){
        System.out.println(a+b);
    }
    public void add1(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public  void add1(double a, double b){
        System.out.println(a+b);
    }

    @Override
    public void add(int a, int b) {
        System.out.println("addition : "+(a+b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Subtraction : "+(a-b));
    }

    @Override
    public void mul(int a, int b) {
        System.out.println("Multiplication : "+(a*b));
    }
}
