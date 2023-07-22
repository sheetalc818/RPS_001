package org.practice.problems.ds.stack;

import java.util.Scanner;

public class StackUC2 {
    // Stack using array
    int[] stack = new int[5];

    // For top element
    int top = -1;

    // Push Operation
    boolean push(int x) {
        // TODO Auto-generated method stub

        /*
         * Checking if the stack
         * is full or not
         */
        if (top == stack.length - 1) {
            System.out.println("STACK OVERFLOW");
            return false;
        } else {
            /*
             * Incrementing the top value
             * and inserting the element in stack
             */
            top = top + 1;
            stack[top] = x;
            return true;
        }

    }

    boolean pop() {
        // TODO Auto-generated method stub

        /*
         * Checking if the stack
         * is empty or not
         */
        if(top == -1) {
            System.out.println("STACK UNDERFLOW");
            return false;
        }
        else {
            /*
             * Decrementing the top value
             * and deleting the element from stack
             */
            top = top-1;
            return true;
        }

    }

    void display() {
        // TODO Auto-generated method stub

        /*
         * Checking if the stack
         * is empty or not
         */
        if(top == -1) {
            System.out.println();
            System.out.println("Stack is Empty");
        }

        // Displaying the stack elements
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        StackUC2 sq = new StackUC2();

        System.out.println();
        System.out.println("***********STACK***********");
        System.out.println();

        int ch = 0;
        while (ch != 4) {
            System.out.println("MENU FOR OPERATIONS ON STACK");
            // Menu for Operations on Stack
            System.out.println("1.Insert an element into stack \n2.Delete an element from stack \n3.Display the stack elements \n4.Exit");
            System.out.println("---------------------------------------------------------");

            System.out.println("Enter choice");
            ch = sc.nextInt();
            System.out.println("---------------------------------------------------------");

            switch (ch) {
                case 1:
                    // User input for inserting the element
                    System.out.println("Enter an element to insert : ");
                    int element = sc.nextInt();
                    sq.push(element);
                    System.out.println("Inserted " + element + " into stack");
                    System.out.println("---------------------------------------------------------");
                    break;

                case 2 :
                    sq.pop();
                    System.out.println("Deleted the top of stack");
                    System.out.println("---------------------------------------------------------");
                    break;

                case 3:
                    System.out.println("DISPLAYING STACK ELEMENTS");
                    sq.display();
                    System.out.println("---------------------------------------------------------");
                    break;

                case 4:
                    System.out.println("Exit");
                    System.exit(0);
                    break;

            }

        }
    }
}
