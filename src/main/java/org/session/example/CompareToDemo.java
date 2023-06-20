package org.session.example;

public class CompareToDemo {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s5="flag";
        String s3="melo";
        String s4="nello";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s4));
        System.out.println(s1.compareTo(s5));
    }
}
