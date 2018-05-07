package hwLessonArrays;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        /*
        Вывести в консоль все парные числа одномерного массива.
         */
        int[] array = {10, 24, 23, 56, 15};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        /*
        Вывести все числа одномерного массива в обратном порядке.
         */
        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + " ");
        }


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
