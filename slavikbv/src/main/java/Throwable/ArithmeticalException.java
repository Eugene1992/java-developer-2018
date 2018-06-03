package Throwable;

public class ArithmeticalException {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        if (a == 0) throw new ArithmeticalExceptionExclusion("wrong argument");
        else System.out.println("square = " + a * b);
/*
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println("Catch");
            //  System.out.println(e.getMessage());
            e.printStackTrace();

        } finally {
            System.out.println("End");
        }
    */
    }


}
