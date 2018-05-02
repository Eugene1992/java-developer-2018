/*6. Найти среднеарифметическое всех чисел массива.*/
package HomeWork5;

public class ArraySrednArifm {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum / array.length);
    }
}
