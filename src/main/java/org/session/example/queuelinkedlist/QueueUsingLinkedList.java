package org.session.example.queuelinkedlist;
public class QueueUsingLinkedList {
    public static void main(String[] args) {
        QueueOperation queueOperation = new QueueOperation();
        queueOperation.enqueue(10);
        queueOperation.enqueue(20);
        queueOperation.dequeue();
        queueOperation.dequeue();
        queueOperation.enqueue(30);
        queueOperation.enqueue(40);
        queueOperation.enqueue(50);
        //queueOperation.dequeue();
        System.out.println("Queue front : "+((queueOperation.front!=null)?(queueOperation.front).key :-1));
        System.out.println("Queue rear : "+((queueOperation.rear!=null)?(queueOperation.rear).key :-1));
    }
}
