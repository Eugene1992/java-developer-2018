

package ArraysHomeWorkNew;

import java.util.Random;

public class ArrayHomeWork {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        /*  5. Найти сумму всех элементов в массиве.*/
        System.out.println("сумма всех элементов массива:\n" + sumArray(array));

        /*6. Найти среднеарифметическое всех чисел массива.*/
        System.out.println(" среднарифметическое массива:\n" + (double) sumArray(array) / (array.length));

        /*7. Найти минимальное и максимальное число в массиве*/
        System.out.println("минимальное число в массиве:\n" + minArray(array));
        System.out.println("максимальное число в массиве:\n" + maxArray(array));

        /*10. Поменять минимальное и максимальное числа в массиве местами.*/
        minMaxChangeArray(array);

        /*17. Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.*/
        System.out.println("сумма элементов массива между минимальным и маскимальным\n" + sumArray(array, minArray(array), maxArray(array)));
    }

    /* сумма всех элементов в массиве.*/
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    /*минимальный элемент массива*/
    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /*максимальный элемент массива*/
    public static int maxArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /*позиция элемента в массиве*/
    public static int positionInArray(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /*смена минимального и максимального элемента*/
    public static void minMaxChangeArray(int[] array) {
        int posmin = positionInArray(array, minArray(array));
        int posmax = positionInArray(array, maxArray(array));
        int element = array[posmin];
        array[posmin] = array[posmax];
        array[posmax] = element;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /*позиция элемента в массиве*/
    public static int sumArray(int[] array, int oneElement, int twoElement) {
        int sum = 0;
        if (oneElement <= twoElement) {
            for (int i = positionInArray(array, oneElement); i <= positionInArray(array, twoElement); i++) {
                sum = sum + array[i];
            }
        }
        if (oneElement > twoElement) {
            for (int i = positionInArray(array, twoElement); i <= positionInArray(array, oneElement); i++) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}


