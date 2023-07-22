package org.session.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        arrayListDemo();
    }

    public static void arrayListDemo(){
        List<String> nameList = new ArrayList<String>();
        List<Integer> numList = new ArrayList<Integer>();
        List<Boolean> list = new ArrayList<Boolean>();
        List<Double> list1 = new ArrayList<Double>();

        nameList.add("ABC");
        nameList.add("ABCD");
        nameList.add("Add");
        nameList.add("XYZ");

        System.out.println(nameList);
        System.out.println(nameList.size());

        nameList.add(4,"PQR");
        System.out.println("For Loop");
        for (int i=0; i< nameList.size(); i++){
            System.out.println(nameList.get(i));
        }

        nameList.set(1,"ghy");
        System.out.println(nameList);
        nameList.remove(3);
        for (String i : nameList){
            System.out.println(i);
        }

        numList.add(10);
        numList.add(11);
        for (int i : numList){
            System.out.println(i);
        }

        Iterator itr = nameList.iterator();
        System.out.println("Name list Elements : ");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void linkedListDemo(){
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(34.6);
        linkedList.add(30.6);
        linkedList.add(3.6);
        linkedList.add(4.6);
        linkedList.add(34.0);

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(linkedList.get(4));
        System.out.println(linkedList.remove(2));
        linkedList.clear();
        System.out.println("cleared the list : "+ linkedList);
    }
}
