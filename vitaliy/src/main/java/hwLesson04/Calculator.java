package hwLesson04;

import static javax.swing.JOptionPane.*;

public class Calculator {
    public static void main(String[] args) {
        /*
Используя IntelliJ IDEA, создайте класс Calculator.
Напишите программу - консольный калькулятор.
Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
Выведите на экран результат выполнения арифметической операции.
В случае использования операции деления, организуйте проверку попытки деления на ноль.
И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
пользователя.
         */
        double number = Double.parseDouble(showInputDialog("Please, enter your number!"));
        double number2 = Double.parseDouble(showInputDialog("Please, enter your number!"));
        String symbol = showInputDialog("Please, chose your arithmetic operation");
        if(number2 ==0 & symbol == "/"){
            showMessageDialog(null, "Error, you can not divide by 0");
        }
        switch(symbol){
            case "+":
                double res = number + number2;
                showMessageDialog(null,res);
                break;
            case "-":
                double res2 = number - number2;
                showMessageDialog(null,res2);
                break;
            case "*":
                double res3 = number * number2;
                showMessageDialog(null,res3);
                break;
            case "/":
                double res4 = number / number2;
                showMessageDialog(null,res4);
                }

        }
    }

