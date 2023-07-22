package org.session.example.SuperAndThisKW;

public class Employee extends Person {
    float salary;
    public Employee(int id, String name, float salary) {
        super(id, name);
        this.salary=salary;
    }

    void display(){
        super.print();
        System.out.println(id+ " "+name+ " "+salary);
    }
}
