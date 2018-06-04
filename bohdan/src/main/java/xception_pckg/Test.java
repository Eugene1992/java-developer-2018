package xception_pckg;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        try {
            arithmeticalTask();
        } catch (ArithmeticException eAE) {
            System.err.println("\n~~~Arithmetic Exception~~~");
            eAE.printStackTrace();
            try {
                NpeTask();
            } catch (NullPointerException eNPE) {
                System.err.println("\n~~~Null Pointer Exception~~~");
                eNPE.printStackTrace();
                try {
                    OomTask();
                } catch (OutOfMemoryError eOOM) {
                    System.err.println("\n~~~Out of Memory Error~~~");
                    eOOM.printStackTrace();
                    try {
                        IaeTask();
                    } catch (IllegalArgumentException eIAE) {
                        System.err.println("\n~~~Illegal Argument Exception~~~");
                        eIAE.printStackTrace();
                    }
                }
            }
        }
    }

    static int arithmeticalTask() {
        return 1 / 0;
    }

    static void NpeTask() {
        Object obj = null;
        obj.hashCode();
    }

    static void OomTask() {
        ArrayList<Integer> list = new ArrayList<>(Integer.MAX_VALUE);
    }

    static void IaeTask() {
        ArrayList<Integer> list = new ArrayList<>(-2);
    }
}
