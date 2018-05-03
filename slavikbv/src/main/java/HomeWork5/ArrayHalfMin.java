/*18. Вывести в консоль половину массива в которой находиться наименьшее число массива.*/
package HomeWork5;

public class ArrayHalfMin {
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
        if (k < array.length / 2) {
            for (int i = 0; i < array.length / 2; i++) System.out.println(array[i]);
        } else {
            for (int i = array.length / 2; i < array.length; i++) System.out.println(array[i]);
        }
    }
}
