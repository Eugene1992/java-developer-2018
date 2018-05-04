/*19. Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b].*/
package HomeWork5;

public class ArrayIntervalToEnd {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 0, 8, 9, 10, 11};
        int a = 2;
        int b = 5;
        int element;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= a && array[i] <= b) {
                element = array[i];
                for (int j = i + 1; j < array.length; j++) {
                    array[j - 1] = array[j];
                }
                array[array.length - 1] = element;
                i = i - 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
