/*11. Инвертировать массив.*/
package HomeWork5;

public class ArrayInvert {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i = 0; i <= array.length / 2; i++) {
            int c = array[i];
            int d = array[array.length - 1 - i];
            array[array.length - 1 - i] = c;
            array[i] = d;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
