package HomeWork3;

import java.util.Scanner;

public class HomeWork36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number:");
        int a = scan.nextInt();

        System.out.println("Enter calculation system 2/8/16:");
        int b = scan.nextInt();
        String s = "";
        while (a > 0) {
            s = a % b + s;
            a = a / b;
        }
        System.out.println(s);
    }
}
