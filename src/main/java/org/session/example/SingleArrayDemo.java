package org.session.example;

public class SingleArrayDemo {
    public static void main(String[] args) {
        //Single D Array
        int[] myNumbers = {1,2,3,4,5};

        int myNumbers1[] = {1,2,3,4,5};
        System.out.println("3rd Index element : "+myNumbers1[3]);
        myNumbers1[1] = 6;
        System.out.println("1st Index element : "+myNumbers1[1]);

        String[] fruits = {"Apple","Orange","Lemon"};
        System.out.println("1st Index element : "+fruits[1]);
        fruits[1] = "Plums";
        System.out.println("1st Index element : "+fruits[1]);

        System.out.println("Fruits array length : "+fruits.length);
        System.out.println("myNumbers array length : "+myNumbers.length);

        for (int i=0; i < fruits.length; i++ ){
            System.out.println("Element at index " +i+ ":" + fruits[i]);
        }

        //for each loop
        for (int i : myNumbers1){
            System.out.println(i);
        }

        //int[] myNumbers2 = new int[2];

    }
}
