package org.session.example;

import java.util.Scanner;

public class SingleArrayDemo {
    public static void main(String[] args) {
        //Single D Array
        int[] myNumbers = {1,2,3,4,5};

        int max=myNumbers[0];
        for (int i=0; i<myNumbers.length; i++){
            if(myNumbers[i] > max)
               max=myNumbers[i];
        }
        System.out.println("Maximum number : "+max);

        int min = myNumbers[0];
        for (int i : myNumbers){
            if (i==5)
                break;
            else {
                if (myNumbers[i] < min)
                    min = myNumbers[i];
            }
        }
        System.out.println("Minimum number : "+min);

        int myNumbers1[] = {1,2,3,4,5};

        System.out.println("3rd Index element : "+myNumbers1[3]);
        myNumbers1[1] = 6;
        System.out.println("1st Index element : "+myNumbers1[1]);

        String[] fruits = {"Apple","Orange","Lemon"};
        System.out.println("1st Index element : "+fruits[1]);
        fruits[0] = "Plums";
        System.out.println("1st Index element : "+fruits[0]);

        System.out.println("Fruits array length : "+fruits.length);
        System.out.println("myNumbers array length : "+myNumbers.length);

        for (int i=0; i < fruits.length; i++ ){
            System.out.println("Element at index " +i+ ":" + fruits[i]);
        }

        //for each loop
        for (int i : myNumbers1){
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of integers in array :");
        int n = scanner.nextInt();
        int[] myNumbers2 = new int[n];// 4

        System.out.println("Enter"+n+" array Elements : ");
        for (int i=0; i<n; i++){//i=0; i<4; i++, 0, 1, 2, 3 , i<4
            myNumbers2[i] = scanner.nextInt();
        }

        //for each loop
        for (int i : myNumbers2){
            System.out.println(i);
        }

        //even position array element
        for (int i=0; i<myNumbers.length;i=i+2){
            System.out.println("The element on even position is:");
            System.out.println(i +":"+ myNumbers[i]);
        }

        System.out.println("odd position array element:");
        for (int i=1; i<myNumbers.length;i=i+2){
            System.out.println("The element on odd position is:");
            System.out.println(i +":"+myNumbers[i]);
        }

        System.out.println("Reverse array :");
        for (int i=myNumbers.length-1;i>=0 ;i--){//5-1=i=4,3,2,1,0
            System.out.println(myNumbers[i]+ " ");
        }
    }
}
