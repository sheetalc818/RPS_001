package org.session.example.generics;

public class ArrayWithGenericMethod {
    public <E> void toPrint(E[] inputArray){
        for (E element : inputArray){
            System.out.printf("%s ",element);
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {10,20,30,40,50};
        Double[] doubleArray = {1.1,2.3,4.3,5.4};
        Character[] charArray = {'a', 'b', 'c', 'd'};

        ArrayWithGenericMethod array = new ArrayWithGenericMethod();
        array.toPrint(intArray);
        array.toPrint(doubleArray);
        array.toPrint(charArray);
    }
}
