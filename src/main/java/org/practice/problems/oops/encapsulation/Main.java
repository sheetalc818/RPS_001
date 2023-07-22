package org.practice.problems.oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("ABCD");
        System.out.println("Object value :"+person);
        person.setName("ABCD");
        System.out.println("User entered data : "+person.getName());
    }
}
