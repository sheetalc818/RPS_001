package org.session.example.ds.ll;

import java.util.Scanner;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedListOperation list = new LinkedListOperation();
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********Welcome To LinkedList DS Menu******************");
        System.out.println("Select option from below list :");
        System.out.println("1. Insert Node At Start\n2. insertNodeAtEnd\n3. deleteNodeAtTheStart\n4. searchForTheNode\n5. Display\n6. Exit\n ");
        choice = scanner.nextInt();
        while (choice!=6){
            switch (choice){
                case 1 : list.insertNodeAtStart(scanner);
                         break;
                case 2 : list.insertNodeAtEnd(scanner);
                         break;
                case 3 : list.deleteNodeAtTheStart();
                         break;
                case 4 : list.searchForTheNode(scanner);
                         break;
                case 5 : list.display();
                         break;
                case 6 : System.out.println("Thank you!");
                         break;
            }
        }
    }
}
