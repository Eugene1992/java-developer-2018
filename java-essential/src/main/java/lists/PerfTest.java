package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerfTest {
    public static void main(String[] args) {
        List<String> arrayList = new LinkedList<>();
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, "a");
            linkedList.add(0, "a");
        }

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_0; i++) {
            arrayList.add(arrayList.size() / 2, "a");
        }
        long end1 = System.currentTimeMillis();

        System.out.println(end1 - start1);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_0; i++) {
            linkedList.add(linkedList.size() / 2, "a");
        }
        long end2 = System.currentTimeMillis();

        System.out.println(end2 - start2);
    }
}
