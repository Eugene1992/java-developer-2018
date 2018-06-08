package lists_pckg;

import java.util.Comparator;

public class MyListComparator<E> implements Comparator<E> {

    @Override
    public int compare(E first, E second) {
        if (first instanceof String) {
            ((String) first).compareTo((String) second);
        }

        return (int) first - (int) second;
    }
}
