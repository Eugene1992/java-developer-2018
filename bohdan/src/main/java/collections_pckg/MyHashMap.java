package collections_pckg;

import java.util.Iterator;

public class MyHashMap<K, V> implements Iterable<K> {

    private int capacity;
    private int size;
    private MyEntry[] buckets;

    public MyHashMap() {
        capacity = 16;
        buckets = new MyEntry[16];
    }

    /*
    public MyLinkedList(Object[] objects) {
        list = new Object[objects.length];
        for (int i = 0; i < objects.length; i++) {
            list[i] = objects[i];
        }
        size = objects.length - 1;
    }
    */


    /*public void keyValidation(K key) {
        int hash = key.hashCode() % capacity;
        MyEntry bucket = buckets[hash];
        while (bucket.next != null) {
            bucket = bucket.getNext();
        }
        if (bucket.getKey() != key) {
            throw new NoSuchElementException("There is no element with that key: " + key);
        }
    }*/

    private void reHash() {
        MyEntry[] buf = new MyEntry[capacity * 2];
        for (int i = 0; i < capacity; i++) {
            if (buckets[i] != null) {
                buf[buckets[i].getHash() % (capacity * 2)] = buckets[i];
            }
        }
        capacity *= 2;
        buckets = buf;
    }

    public MyEntry getFirst() {
        MyEntry first;
        int i = 0;
        first = buckets[i];
        while (first == null && i < size) {
            first = buckets[++i];
        }
        return first;
    }

    public MyEntry getEntryByKey(K key) {
        int hash = key.hashCode() % capacity;

        if (buckets[hash] == null) {
            return buckets[hash];
        }

        MyEntry entry = buckets[hash];
        if (entry.getKey() == key) {
            return entry;
        }
        while (entry.getNext() != null) {
            if (entry.getKey() == key) {
                return entry;
            }
            entry = entry.getNext();
        }
        /*if (bucket.getKey() != key) {
            throw new NoSuchElementException("There is no element with that key: " + key);
        }*/
        return null;
    }

    public MyEntry getLastEntryInBucket(K key) {
        MyEntry entry = buckets[key.hashCode() % capacity];
        if (entry == null) {
            return entry;
        }

        while (entry.getNext() != null) {
            entry = entry.getNext();
        }
        return entry;
    }

    public boolean put(K key, V value) {
        if (size > capacity / 2) {
            reHash();
        }

        MyEntry entry = getEntryByKey(key);
        if (entry == null) {
            buckets[key.hashCode() % capacity] = new MyEntry(key, value);
            size++;
            return true;
        } else if (entry.getKey() == key) {
            entry.value = value;
            return true;
        } else {
            entry = getLastEntryInBucket(key);
            entry.next = new MyEntry(key, value);
            size++;
            return true;
        }

    }

    public V getValue(K key) {
        MyEntry entry = getEntryByKey(key);
        if (entry != null) {
            return (V) entry.getValue();
        } else {
            return null;
        }
    }

    public void remove(K key) {
        MyEntry entry = getEntryByKey(key);
        if (entry != null) {
            if (entry.getNext() != null) {
                entry = entry.getNext();
            } else {
                entry = null;
            }
        }

        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(K key) {
        if (buckets[key.hashCode() % capacity] == null) {
            return false;
        } else {
            MyEntry buf = buckets[key.hashCode() % capacity];
            while (buf != null) {
                if (buf.getKey() == key) {
                    return true;
                }
                buf = buf.getNext();
            }
            return false;
        }
    }


    public void printMap() {
        MyEntry entry;
        int flag = 0;
        System.out.print("[ ");
        for (int i = 0; i < capacity; i++) {
            entry = buckets[i];
            while (entry != null) {
                if (flag == size - 1) {
                    System.out.print(entry);
                    continue;
                }
                System.out.print(entry + ", ");
                entry = entry.getNext();
                flag++;
            }
        }
        System.out.println(" ]");
    }


    @Override
    public Iterator iterator() {
        return new Itr();
    }

    public static class MyEntry<K, V> implements Cloneable {
        final int hash;
        private K key;
        private V value;
        private MyEntry<K, V> next;


        MyEntry(K key, V value) {
            this.hash = key.hashCode();
            this.key = key;
            this.value = value;
            this.next = null;
        }


        public int getHash() {
            return hash;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public MyEntry getNext() {
            return next;
        }

        @Override
        public String toString() {
            return key + " - " + value;
        }

    }

    private class Itr implements Iterator {
        private MyEntry entry;

        Itr() {
            entry = getFirst();
        }

        @Override
        public boolean hasNext() {
            if (entry.getNext() != null) {
                return true;
            } else {
                for (int i = entry.getHash() % capacity + 1; i < capacity; i++) {
                    if (buckets[i] != null) {
                        return true;
                    }
                }
                return false;
            }
        }

        @Override
        public MyEntry next() {
            if (entry.getNext() != null) {
                entry = entry.getNext();
                return entry;
            } else {
                for (int i = entry.getHash() % capacity + 1; i < capacity; i++) {
                    if (buckets[i] != null) {
                        entry = buckets[i];
                        return entry;
                    }
                }
            }
            return null;
        }

    }


}
