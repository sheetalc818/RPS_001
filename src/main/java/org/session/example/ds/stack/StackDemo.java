package org.session.example.ds.stack;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        boolean result = stk.empty();
        System.out.println("is the stack empty? "+result);
        stk.push(56);
        stk.push(30);
        stk.push(70);
        stk.push(23);
        System.out.println("Element in stack : "+stk);
        result = stk.empty();
        System.out.println("is the stack empty? "+result);

        Integer x = stk.pop();
        System.out.println("Deleted data : "+x);
        System.out.println("Element in stack : "+stk);

        Integer X = stk.peek();
        System.out.println("Top Element : "+X);
        System.out.println("Element in stack : "+stk);

        int index =stk.search(30);
        System.out.println("Element 30 found at index : "+index);
        System.out.println("Size of Stack : "+stk.size());

        Iterator iterator = stk.iterator();
        while (iterator.hasNext()){
            Object values = iterator.next();
            System.out.println(values);
        }
        System.out.println("For each : ");
        stk.forEach(n -> {
            System.out.println(n);
        });

        ListIterator<Integer> listIterator = stk.listIterator(stk.size());
        System.out.println("Elements from top to bottom : ");
        while (listIterator.hasPrevious()){
            Integer value = listIterator.previous();
            System.out.println(value);
        }
    }
}
