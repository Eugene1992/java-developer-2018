/*Задание 7
        Используя IntelliJ IDEA, создайте класс Calculator.
        Напишите программу - консольный калькулятор.
                Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
        Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
        Выведите на экран результат выполнения арифметической операции.
                В случае использования операции деления, организуйте проверку попытки деления на ноль.
                И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
        пользователя.*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите число 1:");
        double a = scan.nextInt();
        System.out.println("введите число 2:");
        double b = scan.nextInt();
        System.out.println("введите знак операции:");
        String s = scan.next();

        switch (s) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/": {
                if (b == 0) System.out.println("Error");
                else System.out.println(a / b);
                break;
            }
        }

    }
}
