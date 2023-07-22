package org.practice.problems.ds.linkedlist;

public class LinkedListUC4 {
    int data;
    Node next;
    Node head;
    int size = 0;

    // Node Class
    class Node {
        int data;
        Node next;

        // Parameterized Constructor
        Node(int x) {
            data = x;
            next = null;
        }
    }

    // Inserting new node at the Start of the Linked list
    public Node insertNodeStart(int data) {
        Node newNode = new Node(data);

        // Pointing head to new node inserted
        newNode.next = head;
        head = newNode;
        /* After inserting, incrementing
         * the size of Linked list
         **/
        size++;
        return head;
    }

    // Inserting new node in the Middle of the Linked list
    public void insertNodeMiddle(int data) {
        Node newNode = new Node(data);

        Node slow = head;
        Node fast = head;

        // If Linked list is empty
        if (head == null) {
            return;
        }

        /*
         * Condition for finding out the
         * middle element in Linked list
         */
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        /*
         * If middle element found,
         * inserting the new node after
         * the middle element in Linked list
         */
        slow.next = newNode;

        // After inserting, incrementing the size of Linked list
        size++;
    }


    // Inserting new node at the End of the Linked list
    public void insertNodeEnd(int data) {
        Node newNode = new Node(data);

        /*
         * If Linked list is empty,
         * add a new node
         */
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        // For traversing through the Linked list
        while (temp.next != null) {
            temp = temp.next;
        }
        /*
         * If temp.next == null then
         * add a new node
         */
        temp.next = newNode;
    }

    // Displaying the linked list
    public void display() {
        Node node = head;
        /*
         * Traversing through the Linked list
         * and displaying the elements in Linked list
         */
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedListUC4 l = new LinkedListUC4();
        System.out.println("Creating a Linked List");

        // Inserting node at the Start of the Linked list
        l.insertNodeStart(56);

        // Inserting node in Middle of the Linked list
        l.insertNodeMiddle(30);

        // Inserting node at the End of the Linked list
        l.insertNodeEnd(70);

        l.display();
    }
}
