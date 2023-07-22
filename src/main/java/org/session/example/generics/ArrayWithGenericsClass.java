package org.session.example.generics;
public class ArrayWithGenericsClass<x,y,z> {
    //private T[] inputArray;
//    public ArrayWithGenericsClass(T[] inputArray) {
//        this.inputArray = inputArray;
//    }

    x[] myArrInt;
    y[] myArrDou;
    z[] MyArrChar;

    public ArrayWithGenericsClass(x[] intArray, y[] doubleArray, z[] charArray) {
        this.myArrInt = intArray;
        this.myArrDou = doubleArray;
        this.MyArrChar = charArray;
    }

    public void toPrintMethod(){
        ArrayWithGenericsClass.toPrint(this.myArrInt);
        ArrayWithGenericsClass.toPrint(this.myArrDou);
        ArrayWithGenericsClass.toPrint(this.MyArrChar);
    }
    public static <E> void toPrint(E[] inputArray){
        for (E element : inputArray){
            System.out.printf("%s ",element);
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {10,20,30,40,50};
        Double[] doubleArray = {1.1,2.3,4.3,5.4};
        Character[] charArray = {'a', 'b', 'c', 'd'};

        new ArrayWithGenericsClass<Integer,Double,Character>(intArray,doubleArray,charArray).toPrintMethod();
        new ArrayWithGenericsClass<Integer,Double, Integer>(intArray,doubleArray, intArray).toPrintMethod();
        //new ArrayWithGenericsClass(doubleArray).toPrint();
        //new ArrayWithGenericsClass(charArray).toPrint();
    }
}
