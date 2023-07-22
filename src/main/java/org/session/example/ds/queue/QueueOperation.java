package org.session.example.ds.queue;

public class QueueOperation {
    //implementing queue using array
    int[] queue = new int[5];
    public int front = -1;
    int rear = -1;

    public boolean enqueue(int x){
        if (rear==queue.length-1){
            System.out.println("Queue overflow");
            return false;
        }else if (front==-1 && rear==-1){
            front=0;
            rear=0;
        }else {
            rear=rear+1;
        }
        queue[rear] = x;
        System.out.println("Insertion of "+x+ " done into queue");
        return true;
    }
    
    public boolean dequeue(){
        if (front==-1){
            System.out.println("queue is underflow");
            return false;
        } else if (front==rear) {
            front=rear=-1;
            return true;
        }else{
            front=front+1;
            return true;
        }
    }

    void displayQueue(){
        if (rear==-1){
            System.out.println("Queue is empty");
        }else {
            for (int i = front;i<=rear;i++){
                System.out.println(queue[i]);
            }
        }
    }
}
