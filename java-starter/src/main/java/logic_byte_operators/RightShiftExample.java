package logic_byte_operators;

public class RightShiftExample {
    public static void main(String[] args) {
        byte b = (byte) (-127 >> 2);
        System.out.println(b);

        System.out.println(4 >> 2);
        System.out.println(64 >> 2);
    }
}
