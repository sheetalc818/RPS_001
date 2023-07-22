package org.session.example;

public class StringsNonPrimitive {
    public static void main(String[] args) {
        String str1 = new String("Hi");
        System.out.println(str1);

        String str = "Hello";
        System.out.println(str);
        str.concat("World");// Hello World
        System.out.println("After concat : "+str);

        str = str.concat(" World");
        System.out.println("Concat to str :"+str);

        System.out.println("str length :"+str.length());
        System.out.println("2nd index char : "+str.charAt(2));
        System.out.println(str.compareTo(str1));
    }
}
