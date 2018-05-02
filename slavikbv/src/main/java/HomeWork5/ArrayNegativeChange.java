/*8. Заменить все отрицательные числа в массиве на 0.*/
package HomeWork5;

public class ArrayNegativeChange {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10, 11};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) array[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
