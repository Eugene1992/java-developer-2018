package lesson4.conditionals.hw;

/*
    Задание 7
    Используя IntelliJ IDEA, создайте класс Calculator.
    Напишите программу - консольный калькулятор.
    Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
    Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
    Выведите на экран результат выполнения арифметической операции.
    В случае использования операции деления, организуйте проверку попытки деления на ноль.
    И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
    пользователя.
*/

import java.util.Scanner;

public class Task7_Calculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        boolean errFlag = false;
        double nbr1, nbr2;
        double result = 0;
        String oper;

        System.out.println("Please, enter your numbers and operation:");

        System.out.print("Number 1: ");
        nbr1 = s.nextDouble();

        System.out.print("Operation: ");
        oper = s.next();

        System.out.print("Number 2: ");
        nbr2 = s.nextDouble();

        System.out.println("Calculating: [(" + nbr1 + ") " + oper + " (" + nbr2 + ")]");

        switch (oper) {
            case "+":
                result = nbr1 + nbr2;
                break;
            case "-":
                result = nbr1 - nbr2;
                break;
            case "*":
                result = nbr1 * nbr2;
                break;
            case "/":
                if (nbr2 == 0) {
                    System.out.println("Division by zero. Operation forbidden.");
                    errFlag = true;
                } else {
                    result = nbr1 / nbr2;
                }
                break;
            default:
                System.out.println("Operation not recognized [" + oper + "]");
                errFlag = true;
                break;
        }

        if (!errFlag) {
            System.out.print("Result: [" + result + "];");
        }
    }
}
