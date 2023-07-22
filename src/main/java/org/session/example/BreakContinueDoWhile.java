package org.session.example;

public class BreakContinueDoWhile {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++){
            if (i==4)
                continue;
            System.out.println(i);
        }

        for (int i = 1; i <=10 ; i++){
            if (i==4)
                break;
            System.out.println(i);
        }

        int i = 1, sum=0;
        do{
            sum+=i;
            i++;
        }while (i<=10);
        System.out.println(sum);
    }
}
