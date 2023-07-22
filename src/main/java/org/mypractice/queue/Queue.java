package org.mypractice.queue;

import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println();
        System.out.println("***********QUEUE***********");
        System.out.println();
        QueueOperation queueOperation = new QueueOperation();

        int ch = 0;
        while (ch != 4) {
            System.out.println("MENU FOR OPERATIONS ON STACK");
            System.out.println("1.Insert an element into Queue \n2.Delete an element from Queue \n3.Display the Queue elements \n4.Exit");
            System.out.println("---------------------------------------------------------");

            System.out.println("Enter choice");
            ch = sc.nextInt();
            System.out.println("---------------------------------------------------------");

            switch (ch) {
                case 1:
                    System.out.println("Enter an element to insert : ");
                    int element = sc.nextInt();
                    queueOperation.enqueue(element);
                    System.out.println("---------------------------------------------------------");
                    break;

                case 2:
                    queueOperation.dequeue();
                    System.out.println("Deleted the front element in Queue");
                    System.out.println("---------------------------------------------------------");
                    break;

                case 3:
                    System.out.println("DISPLAYING QUEUE ELEMENTS");
                    queueOperation.display_queue();
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
}
