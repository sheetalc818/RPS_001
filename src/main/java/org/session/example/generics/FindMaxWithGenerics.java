package org.session.example.generics;

public class FindMaxWithGenerics <T extends Comparable<T>>{
    public static <T extends Comparable<T>> T maxOfThreeValues(T a1, T a2, T a3){
        T max = a1;
        if (a2.compareTo(max) > 0){
            max = a2;
        } else if (a3.compareTo(max) > 0) {
            max = a3;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Max int value : "+maxOfThreeValues(4,3,10));
        System.out.println("Max double value : "+maxOfThreeValues(1.5, 6.5,2.3));
        System.out.println("Max string value : "+maxOfThreeValues("abc","pqr", "xyz"));
    }
}
