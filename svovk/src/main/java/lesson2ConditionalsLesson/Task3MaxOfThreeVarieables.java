package lesson2ConditionalsLesson;
//Задание 4
//        Задано три переменных, найти и вывести на экран переменную с максимальным значением
//        (значения всех переменных разные).*/

public class Task3MaxOfThreeVarieables {
    public static void main(String[] args) {

        int a = 45;
        int b = 456;
        int c = 345;

        if (a > b && a > c) {
            System.out.println("a" + "   biggest number");

        } else if (b > a && b > c) {
            System.out.println("b" + "   biggest number");

        } else if (c > b && c > a) {
            System.out.println("c" + "   biggest number");
        }
    }
}