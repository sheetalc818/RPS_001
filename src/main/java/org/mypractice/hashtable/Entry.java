package org.mypractice.hashtable;

class Entry<K, V> {
    K key;
    V value;
    //Constructor, Time O(1), Space O(1)
    public Entry(K key, V val) {
        this.key = key;
        this.value = val;
    }

    //Check equality of entry,compare value not object, Time O(1), Space O(1)
    public boolean equals(Entry<K, V> entry) {
        if (!this.key.equals(entry.key))
            return false;
        return this.value.equals(entry.value);
    }

    //Override, Time O(1), Space O(1)
    @Override
    public String toString() {
        return "(" + key.toString() + ", " + value.toString() + ")";
    }
}