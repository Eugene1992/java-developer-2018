/*3. Вывести первую и вторую половину одномерного массива.*/
package HomeWork5;

public class ArrayPart {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i = 0; i < array.length / 2; i++) System.out.print(array[i] + " ");
        System.out.println();
        for (int i = array.length / 2; i < array.length; i++) System.out.print(array[i] + " ");
        System.out.println();
    }

}
