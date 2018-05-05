/*9*. Подсчитать одинаковые и повторяющиеся числа в одномерном массиве.*/
package HomeWork5;

public class ArrayPovtorCount {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 5, 5, 6, 0, 8, 9, 10, 10, 11};
        int num = 0;
        int sum = 0;
        int k;
        for (int i = 0; i < array.length; i++) {
            k = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (k == array[j]) {
                    num = num + 1;
                    sum = sum + array[j];
                }
            }
        }
        System.out.println("сумма повторяющихся елементов = " + sum * 2);
        System.out.println("количество повторяющихся елементов = " + num * 2);
    }
}
