package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        ListIterator<String> stringListIterator = list.listIterator();

       /* while (stringListIterator.hasNext()) {
            String next = stringListIterator.next();
            System.out.print("Current element: " + next);
            System.out.print(", has next = " + stringListIterator.hasNext());
            System.out.print(", has previous = " + stringListIterator.hasPrevious());
            System.out.print(", next index = " + stringListIterator.nextIndex());
//            System.out.print(", previous element = " + stringListIterator.previous());
            System.out.println(", previous element index = " + stringListIterator.previousIndex());
        }*/

        ListIterator<String> reListIterator = list.listIterator(list.size());
        while (reListIterator.hasPrevious()) {
            String previous = reListIterator.previous();
            if (previous.equals("c")) {
                reListIterator.set("C");
            }
            if (previous.equals("d")) {
                reListIterator.add("D");
            }
            if (previous.equals("e")) {
                reListIterator.remove();
            }
        }

        System.out.println(list);

    }
}
