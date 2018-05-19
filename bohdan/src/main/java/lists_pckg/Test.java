package lists_pckg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 8; i++) {
            arrayList.add("ArLi");
            linkedList.add("LiLi");
        }

        System.out.println("ArrayList stat:");
        printListStats(arrayList);

        System.out.println("\nLinkedList stat:");
        printListStats(linkedList);
    }

    static void printListStats(List list) {
        System.out.println("____________|___start__|___middle___|___end__|");
        System.out.println("    add     |   " + getTimeForAdding(0, list) + "   |   " + getTimeForAdding(list.size() / 2, list)
                + "   |   " + getTimeForAdding(list.size() - 1, list) + "   |");
        System.out.println("    set     |   " + getTimeForSetting(0, list) + "   |   " + getTimeForSetting(list.size() / 2, list)
                + "   |   " + getTimeForSetting(list.size() - 1, list) + "   |");
        System.out.println("   remove   |   " + getTimeForRemoving(0, list) + "   |   " + getTimeForRemoving(list.size() / 2, list)
                + "   |   " + getTimeForRemoving(list.size() - 5, list) + "   |");
        System.out.println("    get     |   " + getTimeForGetting(0, list) + "   |   " + getTimeForGetting(list.size() / 2, list)
                + "   |   " + getTimeForGetting(list.size() - 1, list) + "   |");


    }

    static long getTimeForAdding(int index, List list) {
        long result = 0;
        long begin;
        long end;
        for (int i = 0; i < 5; i++) {
            begin = System.nanoTime();
            list.add(index, "XXX");
            end = System.nanoTime();
            result += (end - begin);
        }
        return result / 5;
    }


    static long getTimeForSetting(int index, List list) {
        long result = 0;
        for (int i = 0; i < 5; i++) {
            long begin = System.nanoTime();
            list.set(index, "XXX");
            long end = System.nanoTime();
            result += (end - begin);
        }
        return result / 5;
    }


    static long getTimeForRemoving(int index, List list) {
        long result = 0;
        for (int i = 0; i < 5; i++) {
            long begin = System.nanoTime();
            list.remove(index);
            long end = System.nanoTime();
            result += (end - begin);
        }
        return result / 5;
    }

    static long getTimeForGetting(int index, List list) {
        long result = 0;
        for (int i = 0; i < 5; i++) {
            long begin = System.nanoTime();
            list.get(index);
            long end = System.nanoTime();
            result += (end - begin);
        }
        return result / 5;
    }

}
