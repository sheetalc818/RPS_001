package org.session.example.association;

import java.util.List;

public class Person {
    private String name;
    List<Mobile> numbers;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", numbers=" + numbers +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mobile> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Mobile> numbers) {
        this.numbers = numbers;
    }
}

