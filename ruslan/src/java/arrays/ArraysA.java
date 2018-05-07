package arrays;

public class ArraysA {
    public static void main(String[] args) {
        int [] computation = {1,2,3,4,5,6,7,8,9,10};
        int even = arrayA(computation);
        arrayB(computation);
        System.out.println("количество" + "    "+ even);
    }
    static int arrayA (int [] nums){
        int even = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                even++;
            }
        }
        return even;
    }
    static void arrayB (int [] nums2) {
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] % 2 == 0) {
                System.out.println(nums2[i]);
            }
        }
    }
}
//1. Вывести в консоль все парные числа одномерного массива.