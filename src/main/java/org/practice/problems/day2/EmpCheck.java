package org.practice.problems.day2;

import org.session.example.ToStringMethod;

import java.util.Random;
public class EmpCheck {
    public static void main(String[] args) {
        int isFullTime = 1;
        int isPartTime = 2;
        int empWagePerHr = 20;
        double salary;
        Random random = new Random();
        int randomCheck = random.nextInt(3);
        //System.out.println(Math.floor(Math.random()*10)%2);
        System.out.println(randomCheck);
        if (randomCheck == isFullTime) {
            System.out.println("Emp full Present!!");
            int dailyHrs = 8;
            salary = (empWagePerHr * dailyHrs);
            System.out.println("Daily salary of Emp : " + salary);
        } else if (randomCheck == isPartTime) {
            System.out.println("Emp part time Present!!");
            int partTimeHrs = 4;
            salary = (empWagePerHr * partTimeHrs);
            System.out.println("Daily salary of Emp : " + salary);
        } else {
            System.out.println("Emp Absent!!");
        }
    }
}
