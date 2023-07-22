package org.session.example;

import java.util.Scanner;

public class SwitchCaseDemoVowels {
    public static void main(String[] args) {
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char:");
        char ch = sc.nextLine().charAt(0); // z

        switch (ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println(ch + " is a vowels");
                break;
            default:
                System.out.println(ch + " is a consonant");
                break;
        }

        System.out.println("Select Operation to perform :" +
                "1. Add 2. Sub 3.Div 4. Mul ");
        int choice = sc.nextInt();

        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch(choice){
            case 1 : result  = a+b;
                System.out.println("Add result : "+result);
                break;
            case 2 : result = a-b;
                System.out.println("Sub result : "+result);
                break;
            case 3 : result = a/b;
                System.out.println("Div result : "+result);
                break;
            case 4 : result = a*b;
                System.out.println("Mul result : "+result);
                break;
            default :
                System.out.println("Invalid choice!!");
                break;
        }
    }
}
