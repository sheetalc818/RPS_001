package org.session.example.books_hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExBook {
    public static void main(String[] args) {
        Map<Integer, Book> map = new HashMap<>();

        Book b1 = new Book(101, "OS", "ANC" ,"ABC1_Pub", 10);
        Book b2 = new Book(102, "Lets C", "KAN", "ADC1",5);
        map.put(1,b1);
        map.put(2,b2);
        for(Map.Entry m : map.entrySet()){
            System.out.println("Print original hashmap data : " + m.getKey()+ " "+m.getValue());
        }

        for (Map.Entry<Integer,Book> entry : map.entrySet()){
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key + " Details : ");
            System.out.println(b.id+ " "+ b.bookName + " "+ b.bookAuthor + " "+b.bookPublisher+ " "+b.quantity);
        }
    }
}
