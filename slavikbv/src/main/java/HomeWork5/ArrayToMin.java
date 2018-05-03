/*16. Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального
элемента всего массива.*/
package HomeWork5;

public class ArrayToMin {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 0, 8, 9, 10, 11};
        int min = array[0];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                k = i;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(array[i]);
        }
    }
}
