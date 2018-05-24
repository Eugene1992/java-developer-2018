package ArrayLinked;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinked {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();

        System.out.println("10 000 000 adding to ArrayList took: " + arrayListAdd(arrayList, 20000000) + "ms");
        System.out.println("10 000 000 adding to LinkedList took: " + linkedListAdd(linkedList, 20000000) + "ms");
        System.out.println();
        System.out.println("adding 1 element to the middle of ArrayList took: " + arrayListAddMid(arrayList) + "ms");
        System.out.println("adding 1 element to the middle of LinkedList took: " + linkedListAddMid(linkedList) + "ms");
        System.out.println();

        long startOne = System.currentTimeMillis();
        String a = arrayList.get(arrayList.size() / 2);
        long endOne = System.currentTimeMillis();
        System.out.println("getting 1 element from the middle of ArrayList took: " + (endOne - startOne) + "ms");

        long startTwo = System.currentTimeMillis();
        String b = linkedList.get(linkedList.size() / 2);
        long endTwo = System.currentTimeMillis();
        System.out.println("getting 1 element from the middle of LinkedList took: " + (endTwo - startTwo) + "ms");
        System.out.println();

        long startThree = System.currentTimeMillis();
        arrayList.set(arrayList.size() / 2, "Hello World");
        long endTrree = System.currentTimeMillis();
        System.out.println("setting 1 element to the middle of ArrayList took: " + (endTrree - startThree) + "ms");

        long startFour = System.currentTimeMillis();
        linkedList.set(linkedList.size() / 2, "Hello World");
        long endFour = System.currentTimeMillis();
        System.out.println("setting 1 element to the middle of LinkedList took: " + (endFour - startFour) + "ms");
        System.out.println();

        long startFive = System.currentTimeMillis();
        arrayList.remove(arrayList.size() / 2);
        long endFive = System.currentTimeMillis();
        System.out.println("removing 1 element from the middle of ArrayList took: " + (endFive - startFive) + "ms");

        long startSix = System.currentTimeMillis();
        linkedList.remove(linkedList.size() / 2);
        long endSix = System.currentTimeMillis();
        System.out.println("removing 1 element from the middle of LinkedList took: " + (endSix - startSix) + "ms");

    }

    //--------------------------------------------//
    public static long arrayListAdd(ArrayList arrayList, int a) {
        long startOne = System.currentTimeMillis();
        for (int i = 0; i <= a; i++) {
            arrayList.add("Hello World");
        }
        long endOne = System.currentTimeMillis();
        return endOne - startOne;
    }

    public static long linkedListAdd(LinkedList linkedList, int a) {
        long startOne = System.currentTimeMillis();
        for (int i = 0; i <= a; i++) {
            linkedList.add("Hello World");
        }
        long endOne = System.currentTimeMillis();
        return endOne - startOne;
    }

    public static long arrayListAddMid(ArrayList arrayList) {
        long startOne = System.currentTimeMillis();
        arrayList.add(arrayList.size() / 2, "Hello World");
        long endOne = System.currentTimeMillis();
        return endOne - startOne;
    }

    public static long linkedListAddMid(LinkedList linkedList) {
        long startOne = System.currentTimeMillis();
        linkedList.add(linkedList.size() / 2, "Hello World");
        long endOne = System.currentTimeMillis();
        return endOne - startOne;
    }
}
