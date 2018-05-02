/*12. Вывести в консоль половину массива, среднеарифметическое которых является большим.*/
package HomeWork5;

public class ArrayHalfAvg {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int sum1 = 0;
        int sum2 = 0;
        double avg1 = 0, avg2 = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sum1 = sum1 + array[i];
        }
        avg1 = sum1 / (array.length / 2);
        for (int i = array.length / 2 + 1; i < array.length; i++) {
            sum2 = sum2 + array[i];
        }
        avg2 = sum2 / (array.length - array.length / 2 + 1);
        if (avg1 >= avg2) {
            for (int i = 0; i < array.length / 2; i++) {
                System.out.println(array[i]);
            }
        }
        if (avg1 < avg2) {
            for (int i = array.length / 2 + 1; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}

