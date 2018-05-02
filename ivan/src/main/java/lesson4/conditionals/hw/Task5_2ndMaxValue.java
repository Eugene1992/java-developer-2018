package lesson4.conditionals.hw;

/*
    Задание 5
    Задано четыре переменных, найти и вывести на экран вторую по величине.
*/

import java.util.Scanner;

public class Task5_2ndMaxValue {
    public static void main(String[] args) {
        int var1, var2, var3, var4, maxVar, maxVar2;

        Scanner s = new Scanner(System.in);

        System.out.println("Please, enter 1st value:");
        var1 = s.nextInt();

        System.out.println("Please, enter 2nd value:");
        var2 = s.nextInt();

        System.out.println("Please, enter 3rd value:");
        var3 = s.nextInt();

        System.out.println("Please, enter 4th value:");
        var4 = s.nextInt();

        if (var1 >= var2) {
            maxVar = var1;
            maxVar2 = var2;
        } else {
            maxVar = var2;
            maxVar2 = var1;
        }

        if (maxVar >= var3) {
            maxVar2 = maxVar2 > var3 ? maxVar2 : var3;
        } else if (maxVar < var3) {
            maxVar2 = maxVar;
            maxVar = var3;
        }

        if (maxVar >= var4) {
            maxVar2 = maxVar2 > var4 ? maxVar2 : var4;
        } else if (maxVar < var4) {
            maxVar2 = maxVar;
        }

        System.out.println("Second MAX value: [" + maxVar2 + "]");
    }
}
