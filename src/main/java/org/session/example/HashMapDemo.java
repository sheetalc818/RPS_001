package org.session.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(1,"Apple");
        hashmap.put(1,"Peach");
        hashmap.put(2,"Grapes");
        hashmap.put(1,"Lemon");
        hashmap.put(3,"Banana");//last in , it is giving priority to that
        hashmap.put(4,"Cherry");
        hashmap.put(1,"Cerry");

        for(Map.Entry m : hashmap.entrySet()){
            System.out.println("Print original hashmap data : " + m.getKey()+ " "+m.getValue());
        }

        System.out.println(hashmap.get(2));
        hashmap.remove(3);
        for(Map.Entry m : hashmap.entrySet()){
            System.out.println("Print hashmap data after removing element : "+ m.getKey()+ " "+m.getValue());
        }
        System.out.println(hashmap.containsKey(4));
        hashmap.replace(4, "Plum");
        for(Map.Entry m : hashmap.entrySet()){
            System.out.println("Print hashmap after replacing element : "+m.getKey()+ " "+m.getValue());
        }

        hashmap.replaceAll((Integer,String)->"Banana");
        for(Map.Entry m : hashmap.entrySet()){
            System.out.println("Print hashmap after replacing all element : "+m.getKey()+ " "+m.getValue());
        }
    }
}
