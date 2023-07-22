package org.session.example.queuelinkedlist;

public class QueueOperation {
    public QNode rear;
    public QNode front;
    public QueueOperation(){
        this.front=this.rear=null;
    }
    public void enqueue(int key){
        QNode temp = new QNode(key);
        if (this.rear==null){
            this.front=this.rear=temp;
        }
        //add the new node at the end of the queue and change the rear
        this.rear.next = temp;
        this.rear=temp;
    }

    public void dequeue(){
        //if queue is empty
        if (this.front==null){
            System.out.println("Empty queue");
        }
        //Store previous front and then move front one node ahead
        QNode temp = this.front;
        this.front = this.front.next;

        //If front is null then change the rear to null as well
        if (this.front==null){
            this.rear=null;
        }
    }
}
