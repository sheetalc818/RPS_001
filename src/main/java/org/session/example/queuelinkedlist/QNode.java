package org.session.example.queuelinkedlist;

public class QNode {
    public int key;
    QNode next;
    public QNode(int key){
        this.key = key;
        this.next = null;
    }
}
