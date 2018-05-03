public class TestArr {
    public static void main(String[] args) {
         int[] arr1 = {2, 5, 8};
        int sum = massive(arr1);
        System.out.println(sum);
    }
    static int massive (int [] args) {
        int sum = 0;
        for (int num = 0; num < args.length; num++)
            sum = sum + args[num];
        return sum;
    }
}
