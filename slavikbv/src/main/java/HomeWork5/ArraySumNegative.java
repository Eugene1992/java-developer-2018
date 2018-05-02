/*13. Найти сумму отрицательных чисел в одномерном массиве.*/
package HomeWork5;

public class ArraySumNegative {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10, 11};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("сумма отрицательных чисел = " + sum);
    }
}
