package org.session.example;

public class PrimitiveDataType {
    static int val1;
    static boolean val2;
    static char val3;
    static  float val4;
    public static void helloWorld(){
        System.out.println("Hi");
    }

    static {
        System.out.println("Default value of Float : " +val4 );
    }

    public static void main(String[] args) {
        System.out.println("integer primitive data type default value : " + val1);
        System.out.println("boolean primitive data type default value : " + val2);
        System.out.println("char primitive data type default value : " + val3);
        helloWorld();
    }
}
