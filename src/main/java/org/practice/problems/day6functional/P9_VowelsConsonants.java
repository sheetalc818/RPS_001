package org.practice.problems.day6functional;

import java.util.Scanner;

public class P9_VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char:");
        char ch = sc.nextLine().charAt(0); // z
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowels");
                break;
            default:
                System.out.println(ch + " is a consonant");
                break;
        }
    }
}
