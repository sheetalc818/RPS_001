package org.practice.problems.ds.linkedlist;

public class LinkedListUC3 {
    int data;
    Node next;
    Node head;

    //Node Class
    class Node {
        int data;
        Node next;

        //Parameterized Constructor
        Node(int x) {
            data = x;
            next = null;
        }
    }

    //Inserting new node at the Start of the Linked list
    public Node insertNodeStart(int data) {
        Node new_node = new Node(data);

        //Pointing head to new node inserted
        new_node.next = head;
        head = new_node;
        return head;
    }

    //Inserting new node at the End of the Linked list
    public void insertNodeEnd(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //Displaying the linked list
    public void display()
    {
        Node node = head;
        while(node!=null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedListUC3 l = new LinkedListUC3();
        System.out.println("Creating a Linked List");

        //Inserting node at the Start of the Linked list
        l.insertNodeStart(56);

        //Inserting node at the End of the Linked list
        l.insertNodeEnd(30);

        //Inserting node at the End of the Linked list
        l.insertNodeEnd(70);

        l.display();

    }
}
