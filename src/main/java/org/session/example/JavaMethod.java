package org.session.example;

public class JavaMethod {
    public static void main(String[] args) {
        int a=4, b=5;
        double add = getMethod(a,b);
        System.out.println("division : "+add);

        getMethod(1.0,4.0, 2.0);
        getVariable(a);
    }
    public static double getMethod(int x, int y){
        double c = x/y;
        return c;
    }
    public static void getMethod(double x, double y, double z){
        double c = x+y+z;
        System.out.println("addition : "+c);
    }
    public static void getVariable(int p){
        System.out.println(p);
    }
}




