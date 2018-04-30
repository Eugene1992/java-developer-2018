package conditionals;

import java.util.Scanner;

public class ConditionalsC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числа для сравнения");

        System.out.println("Введите первое число");
        int compare1 = scan.nextInt();
        System.out.println("Введите второе число");
        int compare2 = scan.nextInt();
        System.out.println("Введите третье число");
        int compare3 = scan.nextInt();
        if ((compare1 > compare2) && (compare1 > compare2)) {
            System.out.println("Наибольшее среди этих чисел");
            System.out.println(compare1);
        }
        if ((compare2 > compare1) && (compare2 > compare3)) {
            System.out.println("Найбольшее среди этих чисел");
            System.out.println(compare2);
        }
        if ((compare3 > compare1) && (compare3 > compare2)) {
            System.out.println("Найбольшее среди этих чисел");
            System.out.println(compare3);
        }
    }
}
//Задание 4
//Задано три переменных, найти и вывести на экран переменную с максимальным значением
//(значения всех переменных разные).