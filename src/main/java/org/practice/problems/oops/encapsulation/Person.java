package org.practice.problems.oops.encapsulation;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person(String name) {
        this.name = name;
    }
}
