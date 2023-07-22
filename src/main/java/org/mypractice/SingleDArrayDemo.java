package org.mypractice;

public class SingleDArrayDemo {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "TATA", "Kia"};
        int[] myNumbers = {3,5,10,5,2};

        System.out.println("Access element");
        System.out.println("2nd Element of Array : "+cars[1]);
        System.out.println("1st Element od myNumbers :"+myNumbers[0]);

        //Change array element
        System.out.println("Change array element");
        cars[3]="KIA";
        System.out.println(cars[3]);

        //array length
        System.out.println("array length");
        System.out.println("Cars array length : "+cars.length);
        System.out.println("MyNum array length : "+myNumbers.length);

        //Loop through array
        System.out.println("Loop through array");
        for (int i = 0; i < cars.length;i++)
            System.out.println("Element at index "+i+":"+cars[i]);

        for (int j =0 ; j < myNumbers.length; j++)
            System.out.println("Element at index "+j+":"+myNumbers[j]);

        //Loop for each
        System.out.println("Loop for each");
        for (String i : cars)
            System.out.println(i);

        for (int j : myNumbers)
            System.out.println(j);
    }
}
