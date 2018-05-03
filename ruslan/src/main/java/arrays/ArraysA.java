package arrays;

public class ArraysA {
    public static void main(String[] args) {
        int [] arr1 = {2,5,6,7,8};
        int any = massive(arr1);
        System.out.println(any);
    }
    static int massive (int [] val){
        int any = 0;
        if (val.length%2 == 0){
            any = any + val.length;
        }
        return any;
    }
}
