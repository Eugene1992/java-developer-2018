package Lesson5Arrays;

public class ClassVideoBiggestNymberarray {
    public static void main(String[] args) {

        int biggestnumber = biggestnumber(new int[]{34567, 8, 2});
        System.out.println(biggestnumber + " is the biggest number");
    }

    static int biggestnumber(int[] arr) {
        int max;
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                System.out.println(max);
            }
        }
        return max;
    }
}

