package Lesson5Arrays;

public class Task2Reverse {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 9; arr.length - 1 > 0; i--) {
            System.out.println(arr[arr.length]);
        }
    }
}
