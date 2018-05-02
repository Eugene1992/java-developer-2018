/*7. Найти минимальное и максимальное число в массиве*/
package HomeWork5;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
