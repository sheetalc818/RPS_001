package org.session.example;

public class ToStringMethod {
    public int rollNo;
    protected String name;
    private String city;
    int mobileNo;

    public ToStringMethod() {
    }

    ToStringMethod(int sRoll, String sName, String sCity){
        this.rollNo=sRoll;
        this.name=sName;
        this.city=sCity;
    }
    ToStringMethod(int sRoll, String sName){
        this.rollNo=sRoll;
        this.name=sName;
    }

    @Override
    public String toString() {
        return "ToStringMethod{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ToStringMethod toStringMethod = new ToStringMethod(100,"abc","Mumbai");
        ToStringMethod toStringMethod1 = new ToStringMethod(101,"abc1","Mumbai");
        ToStringMethod toStringMethod2 = new ToStringMethod(102,"abc1");

        System.out.println(toStringMethod);
        System.out.println(toStringMethod1);
        System.out.println(toStringMethod2);
    }
}




