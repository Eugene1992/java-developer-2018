package java_starter.lesson4.conditionals.hw;
/*
    Задание 4
    Задано три переменных, найти и вывести на экран переменную с максимальным значением
    (значения всех переменных разные).
*/

import java.util.Scanner;

public class Task4_MaxValue {
    public static void main(String[] args) {
        int var1, var2, var3, maxVar;

        Scanner s = new Scanner(System.in);

        System.out.println("Please, enter 1st value:");
        var1 = s.nextInt();

        System.out.println("Please, enter 2nd value:");
        var2 = s.nextInt();

        System.out.println("Please, enter 3rd value:");
        var3 = s.nextInt();

        maxVar = var1 >= var2 ? var1 : var2;
        maxVar = var3 > maxVar ? var3 : maxVar;

        System.out.println("Biggest value is [" + maxVar + "]");
    }
}
