package org.mypractice.hashtable;

import java.util.LinkedList;

public class HashTable<K, V> {
    private int maxSize;
    private LinkedList<Entry<K, V>>[] buckets;
    public HashTable(int capacity) {
        maxSize = capacity;
        buckets = ((LinkedList<Entry<K, V>>[]) new LinkedList[maxSize]);
    }

    //Calculate hashcode by key, Time O(1), Space O(1)
    public int hashFunc(K key) {
        return Integer.parseInt(key.toString()) % maxSize;
    }

    //Add an entry, Time O(1), Space O(1)
    public void put(K key, V value) {
        int x = hashFunc(key);
        if (buckets[x] == null)
            buckets[x] = new LinkedList<Entry<K, V>>();
        LinkedList<Entry<K, V>> list = buckets[x];
        Entry<K, V> entry = new Entry<K, V>(key, value);
        list.add(entry);
    }

    //Return first found value by key, Time O(n), Space O(1), n is max length of list in bucket
    public V get(K key) {
        int x = hashFunc(key);
        if (buckets[x] == null)
            return null;
        LinkedList<Entry<K, V>> list = buckets[x];
        for (Entry<K, V> entry : list) {
            if (entry.key.equals(key))
                return entry.value;
        }
        return null;
    }

    //Delete all entries by key, Time O(n), Space O(n), n is max length of list in bucket
    public void delete(K key) {
        int x = hashFunc(key);
        if (buckets[x] == null)
            return;
        LinkedList<Entry<K, V>> list = buckets[x];
        LinkedList<Entry<K, V>> list2 = new LinkedList<>(); //copy to another list
        for (Entry<K, V> entry : list) {
            if (!entry.key.equals(key)) {
                list2.add(entry);
            }
        }
        buckets[x] = (list2.size() == 0) ? null: new LinkedList<>(list2);
    }

    //Print the whole hash table, Call printList, Time O(m*n), Space O(1),
    //m is size of buckets, n is max list size
    public void print() {
        for (int i = 0; i < maxSize; i++) {
            LinkedList<Entry<K, V>> list = buckets[i];
            if (list != null)
                printList(list);
        }
    }

    //Print list in one bucket, Time O(n), Space O(1), n is list size
    private void printList(LinkedList<Entry<K, V>> list) {
        for (Entry<K, V> entry : list)
            System.out.print(entry + " ");
        System.out.println();
    }

    //Return length of hash table, Time O(m), space O(1), m is bucket max size
    public int size() {
        int length = 0;
        for (int i = 0; i < this.maxSize; i++) {
            LinkedList<Entry<K, V>> list = this.buckets[i];
            if (list != null)
                length++;
        }
        return length;
    }

    public static void main(String[] args) {
        //Put, size and print
        int size = 5;
        HashTable<Integer, String> table = new HashTable<>(size);
        table.put(1, "1");
        table.put(2, "2");
        table.put(2, "5");
        table.put(4, "23");
        table.put(22, "9");
        System.out.println("The HashTable: ");
        table.print();
        System.out.println("The size: " + table.size());

        //Get
        int key = 2;
        System.out.println("Get value of " + key + ": " + table.get(key));
        int k1 = 8;
        System.out.println("Get value of " + k1 + ": " + table.get(k1));

        //update
        table.put(3, "4");
        System.out.println("After update 3");
        table.print();
        System.out.println("The size: " + table.size());

        //Delete
        table.delete(key);
        System.out.println("After delete key " + key);
        table.print();
        System.out.println("The size after delete: " + table.size());
    }
}