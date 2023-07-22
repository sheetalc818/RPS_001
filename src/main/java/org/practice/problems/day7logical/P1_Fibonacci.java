package org.practice.problems.day7logical;

import java.util.Scanner;

public class P1_Fibonacci {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        fibonacci();
    }
    private static void fibonacci() {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("How many fibonacci number you want to print: ");
        int count =sc.nextInt();

        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
