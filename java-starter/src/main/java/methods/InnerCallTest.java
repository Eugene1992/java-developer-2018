package methods;

public class InnerCallTest {
    public static void main(String[] args) {
        int[] array = {11, 4, 12, 7, 45};

        printArray(array, 1, 4);
    }

    static int getArrayMaxElement(int[] arr) {
        return 45;
    }

    static int getArrayMinElement(int[] arr) {
        return 4;
    }

    static int getArrayElementIndex(int[] arr, int elementValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementValue) {
                return i;
            }
        }
        return -1;
    }

    static void printArray(int[] arr, int from, int to) {
        for (int i = from; i < to; i++) {
            System.out.println(arr[i]);
        }
    }

    static int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int arrayAvg(int[] array) {
        return arraySum(array) / array.length;
    }
}
