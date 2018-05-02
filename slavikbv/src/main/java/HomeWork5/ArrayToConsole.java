/*1. Вывести в консоль все парные числа одномерного массива.*/
package HomeWork5;

public class ArrayToConsole {
    public static void main(String[] args) {
        int[] array = new int[10];
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
