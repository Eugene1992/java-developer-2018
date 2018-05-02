/*14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.*/
package HomeWork5;

public class ArrayToZero {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 0, 8, 9, 10, 11};
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.println(array[i]);
            } else {
                System.out.println(array[i]);
                break;
            }
        }
    }
}
