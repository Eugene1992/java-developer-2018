/*17. Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.*/
package HomeWork5;

public class ArraySumBetweenMinMax {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 0, 8, 9, 10, 11};
        int min = array[0], max = array[0];
        int k = 0, l = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                k = i;
            }
            if (array[i] > max) {
                max = array[i];
                l = i;
            }
        }
        for (int i = k; i <= l; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
