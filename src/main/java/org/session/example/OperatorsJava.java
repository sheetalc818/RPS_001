package org.session.example;

import java.util.Scanner;

public class OperatorsJava {
    public int a, b;
    public static void main(String[] args) {
        OperatorsJava operatorsJava = new OperatorsJava();
        operatorsJava.getValues();
        operatorsJava.arithmeticOperator();
        operatorsJava.assignmentOperator();
        operatorsJava.logicalOperator();
        operatorsJava.comparisonOperator();
        operatorsJava.bitWiseOperator();
        operatorsJava.TernaryOperator();
    }
    public void getValues(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        a = scanner.nextInt();
        b = scanner.nextInt();
    }
    public void arithmeticOperator(){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(b++);
        System.out.println(b--);
    }

    public void assignmentOperator(){
        System.out.println(a=b);
        System.out.println(a+=b);//a=a+b
        System.out.println(a-=b);//a=a-b
        System.out.println(a*=b);//a=a*b
        System.out.println(a/=b);//a=a/b
        System.out.println(a%=b);//a=a%b
        System.out.println(a^=b);//a=a^b
        System.out.println(a>>=b);//a=a>>b
        System.out.println(a<<=b);//a=a<<b
    }

    public void logicalOperator(){
        if (a<5 && b>3){
            System.out.println("logical and : Both condition true");
        }

        if (a<5 || b>3){
            System.out.println("logical or : anyone condition is true");
        }

        if (!(a<5 && b >3)){
            System.out.println("logical not : returning true then it turns to false");
        }else System.out.println("false");
    }

    public void comparisonOperator(){
        int c=0;
        if (a<5 && b>3){
            System.out.println("logical and : Both condition true");
        }

        if(a==b)
            System.out.println("Both no are equal");
        else
            System.out.println("Both values are not equal");

        System.out.println(a!=b);
        System.out.println(a<=b);
        System.out.println(a>=b);
    }

    public void bitWiseOperator(){
        int x= 5; //0101
        int y= 7; //0111

        System.out.println("AND" + (x&y)); // 0101 & 0111 : 0101 : 5
        System.out.println("OR : "+(x|y));// 0101 | 0111 : 0111 : 7
        System.out.println("XOR : "+ (x^y));
        System.out.println("Bitwise Not : "+ (~x));
    }

    public void TernaryOperator(){
        int num1=10;
        int num2=20;

        int result = (num1>num2)? (num1+num2) : (num1-num2);
        System.out.println(result);

        int max = (num1>num2) ? num1 : num2;
        System.out.println("Max value is :"+max);

        int min = (num1<num2) ? num1 : num2;
        System.out.println("Min value is :"+min);
    }
}
