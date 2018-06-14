package HashMap;

import java.util.Map;

public class MyHashMap {

    public final double loadFactor = 0.75;
    Map.Entry[] table;
    Object[] key;
    Object[] value;

    public MyHashMap() {
        this.table = new Map.Entry[16];
    }

    public void put(Object key, Object value) {
        int bucket = key.hashCode() % 16;

    }
}
