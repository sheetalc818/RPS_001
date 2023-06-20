package org.session.example;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int i=1;
        int sum=0;
        while (i<=n){
            sum = sum+i;
            i++;
        }
        System.out.println("Total sum : "+sum);
    }
}
