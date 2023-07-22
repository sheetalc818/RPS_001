package org.session.example.SuperAndThisKW;

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void print(){
        System.out.println(id+ " "+name);
    }
}
