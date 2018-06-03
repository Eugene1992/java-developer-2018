package Throwable;

public class NPE {
    public static void main(String[] args) {
        String[] a = null;
        if (a[8] == null) throw new NullPointerException();
    }
}
