package collections.hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {

        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(2);
        ids.add(2);
        ids.add(3);

        Set<Integer> stringSet = new HashSet<>(ids);

        System.out.println(stringSet);
    }


}
