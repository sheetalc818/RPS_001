package org.session.example;

public class EnumDemo {
    enum Days {SUNDAY, MONDAY, SATURDAY};
    enum Season {
        WINTER(5), SPRING(10), PI(3);
        private int value;
        private Season(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Days myVar = Days.SUNDAY;
        System.out.println(myVar);
        System.out.println("Value of : "+Days.valueOf("SUNDAY"));
        System.out.println("Value of with ordinal : "+Days.valueOf("MONDAY").ordinal());

        for(Days myVar1 : Days.values())
            System.out.println("For loop : "+myVar1);

        for (Season s : Season.values())
            System.out.println(s+" "+s.value);
    }
}
