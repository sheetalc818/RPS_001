package org.session.example.ds.hashtable.usinglistandarray;

import java.util.LinkedList;
public class HashTable <K,V>{
    private int maxSize;
    private LinkedList<Entry<K,V>>[] buckets;
    public HashTable(int capacity){
        maxSize = capacity;
        buckets=((LinkedList<Entry<K,V>>[]) new LinkedList[maxSize]);
    }
    public int hashFun(K key){
        return Integer.parseInt(key.toString())%maxSize;
    }

    public void put(K key, V val){
        int x = hashFun(key);
        if (buckets[x]==null){
            buckets[x]=new LinkedList<Entry<K,V>>();
        }
        LinkedList<Entry<K,V>> list = buckets[x];
        Entry<K,V> entry = new Entry<>(key,val);
        list.add(entry);
    }

    //printing whole hashtable
    public void print(){
        for (int i=0;i<maxSize;i++){
            LinkedList<Entry<K,V>> list = buckets[i];
            if (list!=null){
                printList(list);
            }
        }
    }

    //print linked list from hash table
    public void printList(LinkedList<Entry<K,V>> list){
        for (Entry<K,V> entry : list){
            System.out.println(entry+ " ");
        }
        System.out.println();
    }

    public int size(){
        int length = 0;
        for (int i=0;i<this.maxSize;i++){
            LinkedList<Entry<K,V>> list= this.buckets[i];
            if (list!=null)
                length++;
        }
        return length;
    }

    public V get(K key){
        int x = hashFun(key);
        if (buckets[x]==null){
            buckets[x]=new LinkedList<Entry<K,V>>();
        }
        LinkedList<Entry<K,V>> list = buckets[x];
        for (Entry<K,V> entry : list){
            if (entry.key.equals(key)){
                return entry.value;
            }
        }
        return null;
    }

    public void delete(K key){
        int x = hashFun(key);
        if (buckets[x]==null){
            buckets[x]=new LinkedList<Entry<K,V>>();
        }
        LinkedList<Entry<K,V>> list = buckets[x];
        LinkedList<Entry<K,V>> list2 = new LinkedList<>();
        for (Entry<K,V> entry : list){
            if (!entry.key.equals(key)){
                list2.add(entry);
            }
        }
        buckets[x] = (list2.size()==0)?null : new LinkedList<>(list2);
    }

    public static void main(String[] args) {
        int size = 5;
        HashTable<Integer,String> table = new HashTable<>(size);
        //HashTable<String,Integer> table1 = new HashTable<>(size);
        table.put(1,"Swapnil");
        table.put(2,"Bharti");
        table.put(2,"Nazella");
        table.put(4,"Ashwini");
        table.put(22,"Sarini");

        System.out.println("HashTable is :");
        table.print();
        System.out.println("The size is : "+ table.size());
        // Get
        int key=4;
        System.out.println("Get Value of "+key+": "+table.get(key));

        int key1=8;
        System.out.println("Get Value of "+key1+": "+table.get(key1));

        //delete
        table.delete(22);
        System.out.println("After deletion of the 22 key : ");
        table.print();
        System.out.println("The size is : "+ table.size());

        //Update
        table.put(3,"Naveen");
        System.out.println("After updating the list:");
        table.print();
        System.out.println("The size is : "+ table.size());
    }
}
