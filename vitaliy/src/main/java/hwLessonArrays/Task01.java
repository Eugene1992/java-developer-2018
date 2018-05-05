package hwLessonArrays;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        initArray();

    }

    static int[] initArray() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }

}
