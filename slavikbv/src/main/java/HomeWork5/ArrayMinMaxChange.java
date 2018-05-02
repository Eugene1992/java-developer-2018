/*10. Поменять минимальное и максимальное числа в массиве местами.*/
package HomeWork5;

public class ArrayMinMaxChange {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int min = array[0];
        int max = array[0];
        int k = 0, l = 0;
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
        array[k] = max;
        array[l] = min;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
