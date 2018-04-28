package conditionals;

import java.util.Random;

public class SwitchCaseExample {
    public static void main(String[] args) {
        int a = 120;

        if (a == 10) {
            System.out.println("A");
        } else if (a == 11) {
            System.out.println("B");
        } else if (a == 12) {
            System.out.println("C");
        } else if (a == 13) {
            System.out.println("D");
        } else if (a == 14) {
            System.out.println("E");
        } else if (a == 15) {
            System.out.println("F");
        } else {
            System.out.println(a);
        }

        switch (a) {
            case 10:
                System.out.println("A");
                break;
            case 11:
                System.out.println("B");
                break;
            case 12:
                System.out.println("C");
                break;
            case 13:
                System.out.println("D");
                break;
            case 14:
                System.out.println("E");
                break;
            case 15:
                System.out.println("F");
                break;
            default:
                System.out.println(a);
        }
    }
}
