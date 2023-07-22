package org.session.example;

public class OopsDemo extends LeapYear implements InterfaceDemo{
    public void printHello(){
        System.out.println("Hello World!");
    }
    public void printHello1(){
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        OopsDemo oopsDemo = new OopsDemo();
        oopsDemo.printHello();
        oopsDemo.printHello1();
        checkLeapYear();
        System.out.println("a : "+a);
    }
}
