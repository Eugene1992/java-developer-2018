package java_starter.lesson4.conditionals.hw;
/*
    Задание 3
    Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
    Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
*/

import java.util.Scanner;

public class Task3_ClosestToTen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float inNum1, inNum2, diff1, diff2;

        System.out.print("Please, enter first number: ");
        inNum1 = s.nextFloat();

        System.out.print("Please, enter second number: ");
        inNum2 = s.nextFloat();

        diff1 = Math.abs(inNum1 - 10);
        diff2 = Math.abs(inNum2 - 10);

        if (diff1 < diff2) {
            System.out.println("First number [" + inNum1 + "] closest to 10");
        } else if (diff1 > diff2) {
            System.out.println("Second number [" + inNum2 + "] closest to 10");
        } else {
            System.out.println("Numbers has the same distance to 10");
        }
        System.out.println("n1 = [" + inNum1 + "]; diff1 = [" + diff1 + "]; " +
                "n2 = [" + inNum2 + "]; diff2 = [" + diff2 + "];");
    }
}
