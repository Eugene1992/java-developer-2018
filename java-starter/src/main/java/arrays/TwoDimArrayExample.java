package arrays;

public class TwoDimArrayExample {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][2];
        arr1[0] = new int[]{1, 0};
        arr1[1] = new int[]{0, 0};

        int[][] arr2 = {
//                  0  1  2  3
            /* 0 */{1, 0, 0, 5},
            /* 1 */{0, 0, 7, 8},
            /* 2 */{0, 0, 6, 8}
        };

        System.out.println(arr2[1][2]);

        int[][] arr3 = {
                {1, 4, 5, 6, 7},
                {2, 4},
                {5, 7, 4}
        };

        int[][] arr4 = new int[3][];
        arr4[0] = new int[]{1, 4, 5, 6, 7};
        arr4[1] = new int[]{2, 4};
        arr4[2] = new int[]{5, 7, 4};

        int arr5[][][][][][][] = new int[2][2][2][2][2][2][2];
    }
}
