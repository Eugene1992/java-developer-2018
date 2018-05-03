public class MethodTest {
    private static int remember;

    public static void main(String[] args) {
        remember(1, 6);
    }
    static int remember (int anyVal, int anyVal2){
        for (int a = anyVal; a < anyVal2; a++){
            System.out.println(a);
        }
        return remember;
    }
}
