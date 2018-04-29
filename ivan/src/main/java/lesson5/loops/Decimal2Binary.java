package lesson5.loops;

public class Decimal2Binary {
    public static void main(String[] args) {
        int inDecimal = 41;
        int odd;
        String outBinary = "";

        while (inDecimal >= 1) {

            odd = inDecimal % 2;
            outBinary = odd + outBinary;

            inDecimal = inDecimal / 2;
        }

        System.out.println(outBinary);
    }
}
