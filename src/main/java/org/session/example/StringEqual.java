package org.session.example;

import java.util.Scanner;

public class StringEqual extends ToStringMethod  {

    public void test(){
        System.out.println(mobileNo);
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello World";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string :");
        String str3 = sc.next();

        System.out.println(str1.equals(str2));
        if(str1.equals(str3))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }
}
