package org.practice.problems.ds.stack;

import java.util.Scanner;

public class StackUC3 {
    // Stack using array
    int[] stack = new int[5];

    // Queue using array
    int[] queue = new int[5];

    // For top element
    int top = -1;

    // For rear element
    int rear = -1;

    // For front element
    int front = -1;

    // Push Operation for Stack
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
            System.out.println("Inserted " + x + " into Stack");
            return true;
        }

    }

    // Pop Operation for Stack
    boolean pop() {
        // TODO Auto-generated method stub

        /*
         * Checking if the stack
         * is empty or not
         */
        if (top == -1) {
            System.out.println("STACK UNDERFLOW");
            return false;
        } else {
            /*
             * Decrementing the top value
             * and deleting the element from stack
             */
            top = top - 1;
            return true;
        }

    }

    // Displaying the elements of Stack
    void display_stack() {
        // TODO Auto-generated method stub

        /*
         * Checking if the stack
         * is empty or not
         */
        if (top == -1) {
            System.out.println();
            System.out.println("Stack is Empty");
        }

        // Displaying the stack elements
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }

    }

    // Enqueue Operation for Queue
    boolean enqueue(int x) {
        if (rear == queue.length - 1) {
            System.out.println("QUEUE OVERFLOW");
            return false;
        }
        /*
         * front and rear both are at -1
         * then set front and rear at 0 otherwise
         * increment rear
         */
        else if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = rear + 1;
        }
        // inserting element at rear
        queue[rear] = x;
        System.out.println("Inserted " + x + " into Queue");
        return true;
    }

    // Displaying the elements of Queue
    void display_queue() {
        // TODO Auto-generated method stub
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        StackUC3 sq = new StackUC3();

        System.out.println();
        System.out.println("PERFORM OPERATIONS ON");
        System.out.println("1.STACK \n2.QUEUE");
        System.out.println("---------------------------------------------------------");

        System.out.println("Enter choice : ");
        int num = sc.nextInt();
        System.out.println("---------------------------------------------------------");

        if (num == 1) {
            System.out.println();
            System.out.println("***********STACK***********");
            System.out.println();

            int ch = 0;
            while (ch != 4) {
                System.out.println("MENU FOR OPERATIONS ON STACK");
                // Menu for Operations on Stack
                System.out.println(
                        "1.Insert an element into Stack \n2.Delete an element from Stack \n3.Display the Stack elements \n4.Exit");
                System.out.println("---------------------------------------------------------");

                System.out.println("Enter choice");
                ch = sc.nextInt();
                System.out.println("---------------------------------------------------------");

                switch (ch) {
                    case 1:
                        // User input for inserting the element in Stack
                        System.out.println("Enter an element to insert : ");
                        int element = sc.nextInt();
                        sq.push(element);
                        System.out.println("---------------------------------------------------------");
                        break;

                    case 2:
                        sq.pop();
                        System.out.println("Deleted the top of Stack");
                        System.out.println("---------------------------------------------------------");
                        break;

                    case 3:
                        System.out.println("DISPLAYING STACK ELEMENTS");
                        sq.display_stack();
                        System.out.println("---------------------------------------------------------");
                        break;

                    case 4:
                        System.out.println("Exit");
                        System.exit(0);
                        break;

                    default :
                        System.out.println("INVALID CHOICE");
                        System.out.println("---------------------------------------------------------");

                }

            }
        }

        else if (num == 2) {
            System.out.println();
            System.out.println("***********QUEUE***********");
            System.out.println();

            int ch = 0;
            while (ch != 3) {
                System.out.println("MENU FOR OPERATIONS ON STACK");
                // Menu for Operations on Stack
                System.out.println("1.Insert an element into Queue \n2.Display the Queue elements \n3.Exit");
                System.out.println("---------------------------------------------------------");

                System.out.println("Enter choice");
                ch = sc.nextInt();
                System.out.println("---------------------------------------------------------");

                switch (ch) {
                    case 1:
                        // User input for inserting the element in Queue
                        System.out.println("Enter an element to insert : ");
                        int element = sc.nextInt();
                        sq.enqueue(element);
                        System.out.println("---------------------------------------------------------");
                        break;

                    case 2:
                        System.out.println("DISPLAYING QUEUE ELEMENTS");
                        sq.display_queue();
                        System.out.println("---------------------------------------------------------");
                        break;

                    case 3:
                        System.out.println("Exit");
                        System.exit(0);
                        break;

                    default :
                        System.out.println("INVALID CHOICE");
                        System.out.println("---------------------------------------------------------");

                }

            }
        }

        else {
            System.out.println("INVALID CHOICE");
        }
    }
}
