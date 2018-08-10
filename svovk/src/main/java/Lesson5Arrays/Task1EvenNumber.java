package Lesson5Arrays;
//Вывести в консоль все парные числа одномерного массива.

public class Task1EvenNumber {
    public static void main(String[] args) {

        System.out.println("even numbers are :");

        int numEven = even(new int[]{6, 7, 6, 444, 13, 14});
        System.out.println(numEven);
    }

    static int even(int arr[]) {
        int num1;
        num1 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                num1 = arr[i];
            }
        }
        return num1;
    }
}
