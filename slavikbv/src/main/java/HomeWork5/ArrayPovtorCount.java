/*9*. Подсчитать одинаковые и повторяющиеся числа в одномерном массиве.*/
package HomeWork5;

public class ArrayPovtorCount {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 2, 5, 5};
        int num = 0, num1 = 0;
        int sum = 0, sum1 = 0;
        int k;
        for (int i = 0; i < array.length; i++) {
            k = array[i];

            for (int j = 1; j < array.length; j++) {

                if (k == array[j] && j != i) {
                    num = 0;
                    sum = 0;
                    num = num + 1;
                    sum = sum + array[j];
                    sum1 = sum1 + sum / num;
                    num1 = num1 + num;
                }


            }
        }
        System.out.println("сумма повторяющихся елементов = " + sum1);
        System.out.println("количество повторяющихся елементов = " + num1);
    }
}
