package HashMap;

public class HashMap<K, V> {
    private int capacity = 16;
    private int size;
    private Element[] buckets;

    public HashMap() {
        buckets = new Element[16];
        size = 0;
    }

    private void reHash() {
        Element oldElement;
        Element newElement;
        Element[] newBuckets = new Element[2 * capacity];
        for (int i = 0; i < capacity; i++) {
            oldElement = buckets[i];
            if (oldElement != null) {
                newElement = newBuckets[oldElement.getHash() % (2 * capacity)];
                while (newElement.getNext() != null) {
                    newElement = newElement.getNext();
                }
                newElement.next = new Element(oldElement.getKey(), oldElement.getValue());
            }
        }
        capacity = 2 * capacity;
        buckets = newBuckets;
    }

    public void put(K key, V value) {

    }


    public class Element<K, V> {
        private int hash;
        private K key;
        private V value;
        private Element<K, V> next;

        Element(K key, V value) {
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

        public void setKey(K key) {
            this.key = key;
            this.hash = key.hashCode();
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Element<K, V> getNext() {
            return next;
        }

        public void setNext(Element<K, V> next) {
            this.next = next;
        }
    }
}
