package collections.treemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {
    public static void main(String[] args) {
        NavigableMap<Integer, String> stringMap = new TreeMap<>();

        stringMap.put(5, "Five");
        stringMap.put(1, "One");
        stringMap.put(3, "Three");
        stringMap.put(2, "Two");
        stringMap.put(6, "Six");
        stringMap.put(4, "Four");
        stringMap.put(10, "Ten");

//        Map.Entry<Integer, String> entry = stringMap.lowerEntry(6);
//        System.out.println(entry.getValue());
//
//        Integer lowerKey = stringMap.lowerKey(8);
//        System.out.println(lowerKey);
//
//        System.out.println(stringMap.floorEntry(6));
//
//        System.out.println(stringMap.ceilingEntry(7));
//        System.out.println(stringMap.higherEntry(6));

        System.out.println(stringMap);
        System.out.println(stringMap.pollFirstEntry());
        System.out.println(stringMap);
        System.out.println(stringMap.pollLastEntry());
        System.out.println(stringMap);

        System.out.println(stringMap.descendingKeySet());

        System.out.println(stringMap.headMap(3, false));
        System.out.println(stringMap.tailMap(3, false));
    }
}
