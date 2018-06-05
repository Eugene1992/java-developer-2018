package generics;

import java.util.Arrays;
import java.util.List;

public class MethodGenericTest {
    public static void main(String[] args) {
        print("Hello world!", 10);
        print(100500, 10);

        List<Integer> integers = Arrays.asList(2, 42, 12, 21);
        Integer maxElem = getMaxElem(integers, 77);

        List<String> strings = Arrays.asList("dsd", "sdsd", "sds");
        String maxStringElem = getMaxElem(strings, "sdd");
    }


    static <E> void print(E elem, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(elem);
        }
    }

    static <E> E getMaxElem(List<E> elements, E elem) {
        for (E element : elements) {
            if (elements.contains(elem)) {
                return element;
            }
        }
        return null;
    }
}
