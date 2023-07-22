package org.session.example.ds.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("ABC");
        queue.add("fgg");
        queue.add("gBC");
        queue.add("Ayt");
        queue.add("xyz");
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Head: "+queue.element());
        System.out.println("Head: "+queue.peek());
        queue.remove();
        queue.poll();
        System.out.println("After deleting : ");
        Iterator iterator1 = queue.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
