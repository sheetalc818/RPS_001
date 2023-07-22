package org.session.example;

public class StudentComputation {
    public static void main(String[] args) {
        Student[] student = new Student[5];
        student[0] = new Student(101, "ABC");
        student[1] = new Student(102, "Ads");
        student[2] = new Student(103, "Agh");
        student[3] = new Student(104, "hBC");
        student[4] = new Student(105, "sBC");

        for (int i=0; i < student.length; i++){
            System.out.println("Element at "+i+":"+ student[i].rollNo + " " + student[i].name);
        }


    }
}
