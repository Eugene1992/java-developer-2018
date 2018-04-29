package first_pckg;

import java.util.Scanner;

public class HomeworkConditionals {

	static void checkEvenOdd(int i) {
		/*
		 * Задание 2: Создать программу, проверяющую и сообщающую на экран, является ли
		 * введенное с консоли целое число, чётным либо нечётны
		 */

		if (i % 2 == 0)
			System.out.println("Your number is even.");
		else
			System.out.println("Your number is uneven.");
	}

	static void checkCloserToTen(float f1, float f2) {
		/*
		 * Задание 3: Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
		 * введенных с консоли. Например, среди чисел 8,5 и 11,45 ближайшее к десяти
		 * 11,45.
		 */
		if (((f1 - 10) >= 0 ? f1 - 10 : -(f1 - 10)) < ((f2 - 10) >= 0 ? f2 - 10 : -(f2 - 10)))
			System.out.println(f1 + " is closer to 10.");
		else
			System.out.println(f2 + " is closer to 10.");
	}

	static void checkBiggerThreesome(int a, int b, int c) {
		/*
		 * Задание 4: Задано три переменных, найти и вывести на экран переменную с
		 * максимальным значением (значения всех переменных разные).
		 */
		if (a > (b > c ? b : c))
			System.out.println(a + " is the biggest");
		else
			System.out.println((b > c ? b : c) + " is the biggest");
	}

	static void checkSecondBiggerFoursome(int a, int b, int c, int d) {
		/*
		 * Задание 5: Задано четыре переменных, найти и вывести на экран вторую по
		 * величине.
		 */
		if (a > b && a > (c > d ? c : d))
			System.out.println((b > (c > d ? c : d) ? b : (c > d ? c : d)) + " is second in list.");
		else if (b > a && b > (c > d ? c : d))
			System.out.println((a > (c > d ? c : d) ? a : (c > d ? c : d)) + " is second in list.");
		else
			System.out.println(
					((c < d ? c : d) > (a > b ? a : b) ? (c < d ? c : d) : (a > b ? a : b)) + " is second in list.");
	}

	static void solveEquation(float a, float b, float c) {
		/*
		 * Задание 6: В три переменные a, b и c записаны три вещественных числа. Создать
		 * программу, которая будет находить и выводить на экран вещественные корни
		 * квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
		 */
		float D = b * b - 4 * a * c;
		if (D < 0)
			System.out.println("Solution does not exist.");
		else if (D == 0)
			System.out.println("The equation has one solution, x = " + (-b / (2 * a)));
		else
			System.out.println("The equation has two solutions, x1 = " + (-b + Math.sqrt(D) / (2 * a)) + " --- x2 = "
					+ (-b - Math.sqrt(D) / (2 * a)));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("~First task~\nInput an integer number:");
		int i = scan.nextInt();
		checkEvenOdd(i);

		System.out.println("~Second task~\nInput two float numbers:");
		float f1 = scan.nextFloat(), f2 = scan.nextFloat();
		checkCloserToTen(f1, f2);

		System.out.println("~Third task~\nInput three different int numbers:");
		int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
		checkBiggerThreesome(a, b, c);

		System.out.println("~Fourth task~\nInput four different int numbers:");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		int d = scan.nextInt();
		checkSecondBiggerFoursome(a, b, c, d);

		System.out.println("~Fifth task~\nInput the a, b, c coeficients to solve ax^2+bx+c=0:");
		float z = scan.nextFloat(), y = scan.nextFloat(), k = scan.nextFloat();
		solveEquation(z, y, k);

		/*
		 * Задание 7 Используя IntelliJ IDEA, создайте класс Calculator. Напишите
		 * программу - консольный калькулятор. Введите с консоли две переменные.
		 * Предложите пользователю ввести знак арифметической операции. Для организации
		 * выбора алгоритма вычислительного процесса, используйте оператор switch.
		 * Выведите на экран результат выполнения арифметической операции. В случае
		 * использования операции деления, организуйте проверку попытки деления на ноль.
		 * И если таковая имеется, то отмените выполнение арифметической операции и
		 * уведомите об ошибке пользователя/
		 */
		Calculator.main(args);

		/*
		 * Задание 8 Используя IntelliJ IDEA, создайте класс Interval. Напишите
		 * программу определения, попадает ли введенное пользователем число от 0 до 100
		 * в числовой промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то
		 * укажите, в какой именно промежуток. Если пользователь указывает число не
		 * входящее ни в один из имеющихся числовых промежутков, то выводится
		 * соответствующее сообщение.
		 */
		Interval.main(args);

	}
}
