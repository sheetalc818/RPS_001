package org.practice.problems.ds.linkedlist;

public class LinkedListUC6 {
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
        newNode.next = slow.next;
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

    // Deleting node at the Start of the Linked list
    public void deleteNodeStart(int data) {
        // If Linked list is Empty, cannot delete a node
        if(head == null) {
            System.out.println("Linked List is Empty");
        }
        System.out.println("Deleted node : " +head.data);
        /*After deleting, pointing
         * the head to next node
         */
        head = head.next;
    }

    // Deleting node at the End of the Linked list
    public void deleteNodeEnd() {
        /*If Linked list is empty,
         * cannot delete a node
         */
        if(head == null) {
            System.out.println("Linked List is Empty");
        }
        //If Linked has only one node
        if(head.next == null) {
            System.out.println("Deleted node : " +head.data);
            head = head.next;
        }
        Node previous = null;
        Node temp = head;

        //Traversing till the last node
        while(temp.next!=null) {
            // Storing the data of previous node in previous
            previous = temp;
            temp = temp.next;
        }
        System.out.println("Deleted node : " +temp.data);
        /* Assigning 2nd last node to
         * null after deleting the last node
         */
        previous.next = null;
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
        LinkedListUC6 l = new LinkedListUC6();
        System.out.println();
        System.out.println("LINKED LIST");
        System.out.println("---------------------------------------------------------");

        // Inserting node at the Start of the Linked list
        System.out.println("Insertion at Start : ");
        l.insertNodeStart(56);
        l.display();
        System.out.println("---------------------------------------------------------");

        // Inserting node in Middle of the Linked list
        System.out.println("Insertion in Middle : ");
        l.insertNodeMiddle(30);
        l.display();
        System.out.println("---------------------------------------------------------");

        // Inserting node at the End of the Linked list
        System.out.println("Insertion at Last : " );
        l.insertNodeEnd(70);
        l.display();
        System.out.println("---------------------------------------------------------");

        // Deleting node at the Start of the Linked list
        System.out.println("Deletion at Start : ");
        l.deleteNodeStart(56);
        l.display();
        System.out.println("---------------------------------------------------------");


        // Inserting node at the Start of the Linked list
        System.out.println("Insertion at Start : ");
        l.insertNodeStart(56);
        l.display();
        System.out.println("---------------------------------------------------------");

        // Deleting node at the End of the Linked list
        System.out.println("Deletion at End : ");
        l.deleteNodeEnd();
        l.display();

    }
}
