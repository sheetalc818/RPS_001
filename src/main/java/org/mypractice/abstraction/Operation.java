package org.mypractice.abstraction;

abstract class Operation {
    abstract void add(int x, int y);
    abstract void sub(int x, int y);
    abstract void div(int x, int y);

    public void mul(int x, int y) {
        System.out.println("mul :"+(x*y));
    }
}
