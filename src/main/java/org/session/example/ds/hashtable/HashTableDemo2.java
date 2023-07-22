package org.session.example.ds.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo2 {
    public static void main(String[] args) {
        Hashtable<Integer,String> hm = new Hashtable<>();
        hm.put(100,"Suraj");
        hm.put(101,"Bharati");
        hm.put(103,"Ajeet");
        hm.put(104,"Swapnil");
        hm.put(104,"Navneet");
        hm.put(105,"Ashwini");

        for (Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey()+ " "+m.getValue());
        }

        hm.remove(103);
        System.out.println("After removing 103 : ");
        System.out.println(hm);

        System.out.println(hm.getOrDefault(103,"Not Found"));
        System.out.println(hm.getOrDefault(104,"Not Found"));

        System.out.println(hm.putIfAbsent(103, "Bridge"));
        System.out.println("Put if Absent");
        System.out.println(hm);

        System.out.println("Size of the hashtable : "+hm.size());
        if(hm.containsKey(101)){
            String s = hm.get(101);
            System.out.println("101 key mapped value : "+s);
        }
    }
}
