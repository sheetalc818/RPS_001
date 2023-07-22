package org.session.example;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input to flip the coin for no of times:");
        int tossNo = scanner.nextInt();
        flipCoinCall(tossNo);
    }
    public static void flipCoinCall(int tossNo) {
        int head = 0, tail = 0;
        for (int i = 0; i < tossNo; i++) {
            if (Math.random() < 0.5) {
                System.out.println("Head");
                head = head + 1;
            } else {
                System.out.println("Tail");
                tail = tail + 1;
            }
        }
        //int i=0
        //while(i<tossNo){
        //(Math.random()<0.5) ? head++ : tail++
        //i++
        //}
        System.out.println("Percentage of Head : "+(double)head/tossNo*100);
        System.out.println("Percentage of Tail : "+(double)tail/tossNo*100);
    }
}
