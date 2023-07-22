package org.practice.problems.day3;

import java.util.Scanner;

public class ForPalindromeNo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no: ");
        int num = sc.nextInt();
        myMethod(num);
    }
    private static void myMethod(int num) {
        // TODO Auto-generated method stub
        int reverse = 0, rem;
        int  temp = num;

        for( ; temp != 0; temp=temp/10)
        {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
        };

        if (num == reverse)
            System.out.println (num + " is Palindrome");
        else
            System.out.println (num + " is not Palindrome");
    }
}
