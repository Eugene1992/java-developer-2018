/*Задание 6
В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
либо сообщать, что корней нет.*/

import java.util.Scanner;
public class homeWork26 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("a=");
    double a = scan.nextDouble();
    System.out.println("b=");
    double b = scan.nextDouble();
    System.out.println("c=");
    double c = scan.nextDouble();
    double d = (b * b) - (4 * a * c);
    if (d < 0) {System.out.println("корней нету");}
    else{
        double x1 = (-b+Math.sqrt(d))/(2*a);
        double x2 = (-b-Math.sqrt(d))/(2*a);
        System.out.println(x1 + " - 1 корень уравнения");
        System.out.println(x2 + " - 2 корень уравнения");
    }

    }

}
