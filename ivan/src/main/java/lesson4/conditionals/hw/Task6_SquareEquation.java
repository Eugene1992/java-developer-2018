package lesson4.conditionals.hw;

/*
    Задание 6
    В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
    будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
    либо сообщать, что корней нет.
*/

import java.util.Scanner;

public class Task6_SquareEquation {
    public static void main(String[] args) {
        double a, b, c, d;

        Scanner s = new Scanner(System.in);

        System.out.println("Please, enter a,b,c coefficients for equation [a*x2 + b*x + c = 0]");

        System.out.print("a = ");
        a = s.nextFloat();

        System.out.print("b = ");
        b = s.nextFloat();

        System.out.print("c = ");
        c = s.nextFloat();

        System.out.println("Equation: [(" + a + ")*x2 + (" + b + ")*x + (" + c + ") = 0]");

        d = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Calculating discriminant: [" + d + "]");

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("2 roots founded: x1 = [" + x1 + "]; x2 = [" + x2 + "];");
        } else if (d == 0) {
            double x = (-b) / (2 * a);
            System.out.println("1 root founded: x = [" + x + "];");
        } else {
            System.out.println("No roots founded for this equation");
        }
    }
}
