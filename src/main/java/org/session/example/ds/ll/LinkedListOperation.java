package org.session.example.ds.ll;

import java.util.Scanner;

public class LinkedListOperation {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public Node insertNodeAtStart(Scanner scanner){
        System.out.println("Enter the data : ");
        int data = scanner.nextInt();
        Node new_node = new Node(data);
        new_node.next = head;
        head=new_node;
        return head;
    }

    public void insertNodeAtEnd(Scanner scanner){
        System.out.println("Enter the data : ");
        int data = scanner.nextInt();
        Node new_node = new Node(data);
        if (head==null){
            head=new_node;
        }
        Node temp =head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
    }

    public void searchForTheNode(Scanner scanner) {
        System.out.println("Enter the data : ");
        int data = scanner.nextInt();
        Node current = head;
        int i=1;
        boolean flag = false;
        if (head == null) {
            System.out.println("linked list is empty!!");
        }
        else
        {
            while (current != null) {
                if (current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if (flag==true)
            System.out.println("Element "+data+" is present at the index "+i);
        else
            System.out.println("Element not found!!");
    }
    public void deleteNodeAtTheStart(){
        if (head==null){
            System.out.println("Linked list empty");
        }
        System.out.println("Deleted Node: "+head.data);
        head=head.next;
    }

    public void display(){
        Node node = head;
        while (node!=null){
            System.out.printf(node.data+ "->");
            node=node.next;
        }
        System.out.println();
    }
}
