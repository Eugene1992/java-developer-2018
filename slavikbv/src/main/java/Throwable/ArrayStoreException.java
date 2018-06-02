package Throwable;

public class ArrayStoreException {
    public static void main(String[] args) {
        Object[] o = "a;b;c".split(";");
        try {
            o[0] = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}