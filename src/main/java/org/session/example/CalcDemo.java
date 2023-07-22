package org.session.example;

abstract class CalcDemo {

    public abstract void add(int a, int b);
    public abstract void sub(int a, int b);
    public abstract void mul(int a, int b);
    public void div(int a, int b){
        System.out.println("Division : "+(a/b));
    }
}
