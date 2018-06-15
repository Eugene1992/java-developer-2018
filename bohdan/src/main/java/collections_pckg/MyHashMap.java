package collections_pckg;

public class MyHashMap<K, V> {

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
        MyEntry entry;
        MyEntry newEntry;
        int newCapacity = capacity * 2;
        MyEntry[] newBuckets = new MyEntry[newCapacity];
        for (int i = 0; i < capacity; i++) {
            entry = buckets[i];
            if (entry != null) {
                if (newBuckets[entry.getHash() % newCapacity] == null) {
                    newBuckets[entry.getHash() % newCapacity] = new MyEntry(entry.getKey(), entry.getValue());
                } else {
                    newEntry = newBuckets[entry.getHash() % newCapacity];
                    while (newEntry.getNext() != null) {
                        newEntry = newEntry.getNext();
                    }
                    newEntry.next = new MyEntry(entry.getKey(), entry.getValue());
                }
            }
        }
        capacity = newCapacity;
        buckets = newBuckets;
    }

    public MyEntry getFirst() {
        if (isEmpty()) {
            return null;
        }
        MyEntry first;
        int i = 0;
        first = buckets[i];
        while (first == null && i < capacity) {
            first = buckets[++i];
        }
        return first;
    }


    public MyEntry getEntryByKey(K key) {
        MyEntry entry = buckets[key.hashCode() % capacity];

        if (entry == null) {
            return null;
        }

        if (entry.getKey() == key) {
            return entry;
        } else {
            while (entry.getNext() != null) {
                entry = entry.getNext();
                if (entry.getKey() == key) {
                    return entry;
                }
            }
        }
        /*if (bucket.getKey() != key) {
            throw new NoSuchElementException("There is no element with that key: " + key);
        }*/
        return null;
    }

    public MyEntry getLastEntryInBucket(K key) {
        MyEntry entry = buckets[key.hashCode() % capacity];

        if (entry == null) {
            return null;
        }

        while (entry.getNext() != null) {
            entry = entry.getNext();
        }
        return entry;
    }

    public void put(K key, V value) {
        if (size > (capacity / 2)) {
            reHash();
        }
        MyEntry entry;
        if (!contains(key)) {
            entry = getLastEntryInBucket(key);
            if (entry == null) {
                buckets[key.hashCode() % capacity] = new MyEntry(key, value);
            } else {
                entry.setNext(new MyEntry(key, value));
            }
            size++;
        } else {
            entry = getEntryByKey(key);
            entry.setValue(value);
        }
        /*MyEntry entry = getEntryByKey(key);
        if (entry == null) {
            buckets[key.hashCode() % capacity] = new MyEntry(key, value);
            size++;
            return true;
        } else if (entry.getKey() == key) {
            entry.setValue(value);
            return true;
        } else {
            entry = getLastEntryInBucket(key);
            if (entry == null) {
                buckets[key.hashCode() % capacity] = new MyEntry(key, value);
                size++;
                return true;
            }
            entry.setNext(new MyEntry(key, value));
            size++;
            return true;
        }*/
    }

    public V getValue(K key) {
        MyEntry entry = getEntryByKey(key);
        if (entry != null) {
            return (V) entry.getValue();
        } else {
            return null;
        }
    }

    // TODO: 6/15/2018 Cannot remove object through link to the buckets array
    public void remove(K key) {
        if (contains(key)) {
            MyEntry entry = getEntryByKey(key);
            /*
            entry = entry.next;
            */
            if (entry.getNext() != null) {
                entry.becomeNext();
            } else {
                //entry = null;
            }

            size--;
        }
        /*MyEntry entry = getEntryByKey(key);
        if (entry != null) {
            if (entry.getNext() != null) {
                entry = entry.getNext();
            } else {
                entry = null;
            }
        }

        size--;*/
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(K key) {
        if (isEmpty()) {
            return false;
        }
        if (buckets[key.hashCode() % capacity] == null) {
            return false;
        } else {
            MyEntry entry = buckets[key.hashCode() % capacity];
            while (entry != null) {
                if (entry.getKey() == key) {
                    return true;
                }
                entry = entry.getNext();
            }
            return false;
        }
    }


    public void printMap() {
        MyEntry entry;
        System.out.print("[   ");
        for (int i = 0; i < capacity; i++) {
            entry = buckets[i];
            while (entry != null) {
                System.out.print(entry + "  ");
                entry = entry.getNext();
            }
        }
        System.out.println(" ]");
    }


    public static class MyEntry<K, V> implements Cloneable {
        private int hash;
        private K key;
        private V value;
        private MyEntry<K, V> next;


        MyEntry(K key, V value) {
            this.hash = key.hashCode();
            this.key = key;
            this.value = value;
            this.next = null;
        }

        public void becomeNext() {
            this.hash = next.hash;
            this.key = (K) next.key;
            this.value = (V) next.value;
            this.next = next.next;
        }

        public void setKey(K key) {
            this.key = key;
            this.hash = key.hashCode();
        }

        public void setValue(V value) {
            this.value = value;
        }

        public void setNext(MyEntry<K, V> next) {
            this.next = next;
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
            return "{" + key + " - " + value + "}";
        }

    }

}
