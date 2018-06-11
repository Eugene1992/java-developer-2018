package comparator;

import java.util.ArrayList;
import java.util.List;

public class RetainAllTest {
    public static void main(String[] args) {
        List<String> listOne = new ArrayList<>();
        List<String> listTwo = new ArrayList<>();

        listOne.add("a");
        listOne.add("b");
        listOne.add("c");
        listOne.add("d");

        listTwo.add("g");
        listTwo.add("h");
        listTwo.add("c");
        listTwo.add("d");

        listOne.retainAll(listTwo);

        System.out.println(listOne);
        System.out.println(listTwo);
    }
}
