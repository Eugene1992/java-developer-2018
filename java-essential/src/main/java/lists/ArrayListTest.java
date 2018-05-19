package lists;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");

        arrayList.add("f");
        arrayList.add("g");
        arrayList.add("h");
        arrayList.add("i");
        arrayList.add("j");

        System.out.println();


        arrayList.add(3, "XXX");

        arrayList.add(5, null);

        System.out.println(arrayList);

    }

}
