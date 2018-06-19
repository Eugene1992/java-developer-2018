package collections.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTest {
    public static void main(String[] args) {
        SortedMap<Integer, String> stringMap = new TreeMap<>();

        stringMap.put(5, "Five");
        stringMap.put(1, "One");
        stringMap.put(3, "Three");
        stringMap.put(2, "Two");
        stringMap.put(6, "Six");
        stringMap.put(4, "Four");

        SortedMap<Integer, String> sortedMap = stringMap.subMap(3, 5);

        System.out.println(sortedMap);

        SortedMap<Integer, String> headMap = stringMap.headMap(3);

        System.out.println(headMap);

        System.out.println(stringMap.tailMap(3));

        System.out.println(stringMap.firstKey());
        System.out.println(stringMap.lastKey());


    }
}
