package collections_pckg;

public class MyHashMapTest {

    public static void main(String[] args) {

        MyHashMap<Integer, String> map = new MyHashMap<>();

        map.put(1432, "test1");
        map.put(3780, "test3");
        map.put(2125, "test2");
        map.put(0, "test0");
        map.put(1092, "test10");
        map.put(6578, "test4");
        map.put(324, "test6");
        map.put(89, "test7");
        map.put(46, "test9");
        map.put(293, "test11");
        map.put(5, "test5");
        map.put(764, "test8");
        map.put(37, "test99");
        map.printMap();

        map.put(324, "test4");
        map.put(3, "test33");
        map.printMap();

        map.remove(0);
        map.printMap();

        System.out.println(map.contains(3));
        System.out.println(map.contains(7));

        System.out.println(map.getValue(3));
        System.out.println(map.getValue(0));
    }

}
