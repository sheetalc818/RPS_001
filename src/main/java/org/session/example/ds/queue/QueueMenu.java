package org.session.example.ds.queue;

import java.util.Scanner;

public class QueueMenu {
    public static void main(String[] args) {
        System.out.println("Welcome to the Queue Menu Driven operation Program : ");
        Scanner scanner= new Scanner(System.in);
        QueueOperation queueOperation = new QueueOperation();

        int choice = 0;
        while(choice!=4){
            System.out.println("Select option from below menu: ");
            System.out.println("1.Enqueue\n2.Dequeue\n3.Display Queue\n4.Exit");
            int ch = scanner.nextInt();
            switch (ch){
                case 1 :
                    System.out.println("Enter the Element to be inserted :");
                    int element = scanner.nextInt();
                    queueOperation.enqueue(element);
                    break;
                case 2 :queueOperation.dequeue();
                     break;
                case 3 : queueOperation.displayQueue();
                     break;
                case 4 :
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid choice ");
                    break;
            }
        }
    }
}
