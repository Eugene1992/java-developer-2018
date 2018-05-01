package lesson2ConditionalsLesson;
/*Задание 5
Задано четыре переменных, найти и вывести на экран вторую по величине.*/

public class Task4secondBiggestNumber {
    public static void main(String[] args) {

        int a = 4;
        int b = 5;
        int c = 76;
        int d = 34;
        int checker = 0;

        if (a > b & a > c & a > d) {
            System.out.println("b");

        } else if (c > b) {
            System.out.println("c");
        }
    }
}
