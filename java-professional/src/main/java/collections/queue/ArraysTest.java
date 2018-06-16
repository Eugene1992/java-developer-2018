package collections.queue;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {4, 32, 54, 2, 34};

        int[] ints = Arrays.copyOfRange(arr, 3, 5);

        System.out.println(Arrays.toString(ints));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
