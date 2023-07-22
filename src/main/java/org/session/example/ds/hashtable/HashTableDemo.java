package org.session.example.ds.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        String s = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String a[] = s.split(" ");
        Map<String,Integer> words = new Hashtable<>();
        for (String str : a){
            if (words.containsKey(str)){
                words.put(str,1+ words.get(str));
            }else {
                words.put(str,1);
            }
        }
        System.out.println(words);
    }
}
