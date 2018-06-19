package array_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("ArrayList add method");
        speedTestAddMethod(arrayList, 1_000_000, 0, 5, 1000);
        speedTestAddMethod(arrayList, 1_000_000, 999_999, 5, 1000);
        speedTestAddMethod(arrayList, 1_000_000, 500_000, 5, 1000);

        System.out.println("LinkedList add method");
        speedTestAddMethod(linkedList, 1_000_000, 0, 5, 1000);
        speedTestAddMethod(linkedList, 1_000_000, 999_999, 5, 1000);
        speedTestAddMethod(linkedList, 1_000_000, 500_000, 5, 1000);

        System.out.println("ArrayList set method");
        speedTestSetMethod(arrayList, 1_000_000, 0, 5);
        speedTestSetMethod(arrayList, 1_000_000, 999_999, 5);
        speedTestSetMethod(arrayList, 1_000_000, 500_000, 5);

        System.out.println("LinkedList set method");
        speedTestSetMethod(linkedList, 1_000_000, 0, 5);
        speedTestSetMethod(linkedList, 1_000_000, 999_999, 5);
        speedTestSetMethod(linkedList, 1_000_000, 500_000, 5);

        System.out.println("ArrayList get method");
        speedTestGetMethod(arrayList, 1_000_000, 0, 5);
        speedTestGetMethod(arrayList, 1_000_000, 999_999, 5);
        speedTestGetMethod(arrayList, 1_000_000, 500_000, 5);

        System.out.println("LinkedList get method");
        speedTestGetMethod(linkedList, 1_000_000, 0, 5);
        speedTestGetMethod(linkedList, 1_000_000, 999_999, 5);
        speedTestGetMethod(linkedList, 1_000_000, 500_000, 5);

        System.out.println("ArrayList remove method");
        speedTestRemoveMethod(arrayList, 1_000_000, 0, 5, 1000);
        speedTestRemoveLastElementMethod(arrayList, 1_000_000, 5, 1000);
        speedTestRemoveMethod(arrayList, 1_000_000, 500_000, 5, 1000);

        System.out.println("LinkedList remove method");
        speedTestRemoveMethod(linkedList, 1_000_000, 0, 5, 1000);
        speedTestRemoveLastElementMethod(linkedList, 1_000_000, 5, 1000);
        speedTestRemoveMethod(linkedList, 1_000_000, 500_000, 5, 1000);

    }

    public static long speedTestAddMethod(List<String> list, int listSize, int position, int iteration, int countAddElements) {
        long sum = 0;
        long start;
        long end;
        list.clear();
        for (int j = 0; j < listSize; j++) {
            list.add(Integer.toString(j));
        }

        for (int i = 0; i < iteration; i++) {
            start = System.currentTimeMillis();
            for (int k = 0; k < countAddElements; k++) {
                list.add(position, "a");
            }
            end = System.currentTimeMillis();

            sum = sum + end - start;
        }

        System.out.println(sum / iteration);
        return sum / iteration;
    }

    public static long speedTestSetMethod(List<String> list, int listSize, int position, int iteration) {
        long sum = 0;
        long start;
        long end;
        list.clear();
        for (int j = 0; j < listSize; j++) {
            list.add(Integer.toString(j));
        }

        for (int i = 0; i < iteration; i++) {
            start = System.currentTimeMillis();
            list.set(position, "a");
            end = System.currentTimeMillis();

            sum = sum + end - start;
        }

        System.out.println(sum / iteration);
        return sum / iteration;
    }

    public static long speedTestGetMethod(List<String> list, int listSize, int position, int iteration) {
        long sum = 0;
        long start;
        long end;
        list.clear();
        for (int j = 0; j < listSize; j++) {
            list.add(Integer.toString(j));
        }

        for (int i = 0; i < iteration; i++) {
            start = System.currentTimeMillis();
            list.get(position);
            end = System.currentTimeMillis();

            sum = sum + end - start;
        }

        System.out.println(sum / iteration);
        return sum / iteration;
    }

    public static long speedTestRemoveMethod(List<String> list, int listSize, int position, int iteration, int countRemoveElements) {
        if (listSize <= countRemoveElements) throw new ArrayIndexOutOfBoundsException();
        else {
            long sum = 0;
            long start;
            long end;
            list.clear();
            for (int j = 0; j < listSize; j++) {
                list.add(Integer.toString(j));
            }

            for (int i = 0; i < iteration; i++) {
                start = System.currentTimeMillis();
                for (int k = 0; k < countRemoveElements; k++) {
                    list.remove(position);
                }
                end = System.currentTimeMillis();

                sum = sum + end - start;
            }

            System.out.println(sum / iteration);
            return sum / iteration;
        }
    }

    public static long speedTestRemoveLastElementMethod(List<String> list, int listSize, int iteration, int countRemoveElements) {
        if (listSize <= countRemoveElements) throw new ArrayIndexOutOfBoundsException();
        else {
            long sum = 0;
            long start;
            long end;
            list.clear();
            for (int j = 0; j < listSize; j++) {
                list.add(Integer.toString(j));
            }

            for (int i = 0; i < iteration; i++) {
                start = System.currentTimeMillis();
                for (int k = 0; k < countRemoveElements; k++) {
                    list.remove(list.size() - 1);
                }
                end = System.currentTimeMillis();

                sum = sum + end - start;
            }

            System.out.println(sum / iteration);
            return sum / iteration;
        }
    }
}
