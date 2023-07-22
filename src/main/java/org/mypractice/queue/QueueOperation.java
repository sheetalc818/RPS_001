package org.mypractice.queue;

public class QueueOperation {
    // Queue using array
    int[] queue = new int[5];
    int rear = -1;
    int front = -1;
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
    boolean dequeue() {
        if (front == -1) {
            System.out.println("QUEUE UNDERFLOW");
            return false;
        }
        /*
         * if front and rear reach at maxsize
         * then initialize it at -1
         */
        else if (front == rear) {
            front = rear = -1;
            return true;
        }
        // Incrementing the front
        else {
            front = front + 1;
            return true;
        }
    }

    void display_queue() {
//        for (int i = front; i <= rear; i++) {
//            System.out.println(queue[i]);
//        }

        if (rear == -1) {
            System.out.println();
            System.out.println("Queue is Empty");
        }
        else {
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}
