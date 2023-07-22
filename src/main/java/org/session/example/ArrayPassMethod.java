package org.session.example;

import java.util.Scanner;
public class ArrayPassMethod {
    public static void main(String[] args) {
        String name = engineerName();
        System.out.println(name);
        int arr[] = returnArray();
        sum(arr);
    }
     public static void sum(int[] arr){
        int sum=0;
        for (int i=0; i< arr.length; i++){
            sum+=arr[i]; //sum = 0+3 = sum=3+1 = sum=4+2= sum=6+4 = sum=10+5=15
        }
         System.out.println(sum);
     }
     public static int[] returnArray(){
        int[] arr = new int[] {3,1,2,4,5};
        return arr;
     }

     public static String engineerName(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Engineer name:");
         String engiName= sc.next();
         return engiName;
     }
}
