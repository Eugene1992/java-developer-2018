package lists;

import java.util.Arrays;

public class SacTest {
    public static void main(String[] args) {
        String[] from = {"a", "b", "c", "d", "e"};
        String[] to = new String[3];

        System.arraycopy(from, 0, to, 1, 2);

        System.out.println(Arrays.toString(from));
        System.out.println(Arrays.toString(to));


        String[] strings = Arrays.copyOf(from, 2);

        System.out.println(Arrays.toString(strings));
    }
}
