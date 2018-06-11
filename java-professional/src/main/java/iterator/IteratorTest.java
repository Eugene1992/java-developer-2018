package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String elem = iterator.next();
            if (elem.equals("d")) {
                iterator.remove();
            }
        }
    }
}
