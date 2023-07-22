package org.practice.problems.day6functional;

import java.util.Scanner;
public class P1_FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to Flip Coin:");
        int toss = sc.nextInt();
        flipCoin(toss);
    }
    public static void flipCoin(int toss) {
        int heads=0 , tails=0 ;

        for (int i = 0; i < toss ; i++) {
            if (Math.random() < 0.5){
                System.out.println("Heads");
                heads=heads+1;
            }
            else{
                System.out.println("Tails");
                tails=tails+1;
            }
        }
        System.out.println("percentage of heads : " + (double)heads/toss*100 );
        System.out.println("percentage of tails:" + (double)tails/toss*100);
    }
}
