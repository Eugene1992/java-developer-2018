package first_pckg;

import java.util.Arrays;
import java.util.Random;

public class ArrayLoopTask {
    static int getArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int getArrayMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int[] getFilledArray(int amount, int min, int max) {
        Random rand = new Random();
        int[] arr = new int[amount];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(max - min) + min;
        }
        return arr;
    }

    static void getHalfWithMin(int[] arr) {
        int min = arr[0];
        int buf = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                buf = i;
            }
        }
        if (buf < (arr.length / 2)) {
            System.out.print("Min: " + min + "\nHalf with min: ");
            for (int i = 0; i < (arr.length / 2); i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.print("Min: " + min + "\nHalf with min: ");
            for (int i = (arr.length / 2); i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void getDublicateAmount(int[] arr) {
        int count = 0;
        int n = 0;
        int buf = arr[0];
        int bufArray[] = new int[arr.length * 2];
        for (int i = 1; i < arr.length; i++) {
            inner:
            for (int j = i; j < arr.length; j++) {
                if (buf == arr[j]) {
                    for (int k = 0; k < bufArray.length; k++) {
                        if (buf == bufArray[k]) {
                            continue inner;
                        }
                    }
                    count++;
                }
            }
            bufArray[n] = buf;
            n++;
            buf = arr[i];
        }
        System.out.println("Dublicate amount: " + count);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum: " + getArraySum(arr));
        System.out.println("Max: " + getArrayMax(arr));
        System.out.println("Method array:\n" + Arrays.toString(getFilledArray(6, -10, 20)));
        System.out.println("\n" + Arrays.toString(arr));
        getHalfWithMin(arr);
        System.out.println("\n");
        int[] array = {1, 1, 3, 4, 3, 3, 4, 1, 4, 5};
        System.out.println(Arrays.toString(array));
        getDublicateAmount(array);
    }
}
