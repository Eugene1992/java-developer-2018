/*15. Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.*/
package HomeWork5;

public class ArrayTwoLargest {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 4, 5, 7, 6, 8, 11, 9, 10};
        int maxmax = array[0];
        int max = array[0];
        int k = 0, l = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxmax) {
                maxmax = array[i];
                k = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max && array[i] < maxmax) {
                max = array[i];
                l = i;
            }
        }
        array[k] = array[0];
        array[0] = maxmax;
        array[l] = array[array.length - 1];
        array[array.length - 1] = max;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

