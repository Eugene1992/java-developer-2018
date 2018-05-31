package homeWork05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println(speedTest(arrayList, 50, 25, 1, 100));

    }

    public static long speedTest(List<String> list, int listSize, int position, int iteration, int newListSize) {
        long sum = 0;
        for (int i = 0; i < iteration; i++) {
            System.out.println(i);

            for (int j = 0; j < listSize; i++) {
                list.add(0, Integer.toString(j));
            }

            long start = System.currentTimeMillis();
            for (int j = 0; j < newListSize; i++) {
                list.add(position, "a");
            }
            long end = System.currentTimeMillis();

            sum += end - start;
        }

        return sum / iteration;

    }
}
