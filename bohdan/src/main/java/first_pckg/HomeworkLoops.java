package first_pckg;

import java.util.Scanner;

public class HomeworkLoops {

	public static void main(String[] args) {
		{
			// 1. Создайте программу, выводящую на экран все четырёхзначные числа
			// последовательности 1000 1003 1006 1009 1012 1015 ….
			for (int i = 1000; i < 10000; i += 3) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		{
			// 2. Создайте программу, выводящую на экран первые 55 элементов
			// последовательности 1 3 5 7 9 11 13 15 17 ….
			for (int i = 0, x = 1; i < 55; i++, x += 2) {
				System.out.print(x + ", ");
			}
		}
		System.out.println();
		{
			// 3. Создайте программу, выводящую на экран все неотрицательные элементы
			// последовательности 90 85 80 75 70 65 60 ….
			for (int i = 90; i >= 0; i -= 5) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		{
			// 4. Создайте программу, выводящую на экран первые 20 элементов
			// последовательности 2 4 8 16 32 64 128 ….
			for (int i = 0, x = 2; i < 20; i++, x *= 2) {
				System.out.print(x + ", ");
			}
		}
		System.out.println();
		{
			// 5. Выведите на экран первые 20 членов последовательности Фибоначчи.
			int x;
			int buf1 = 1, buf2 = 1;
			System.out.print("1, 1, ");
			for (int i = 0; i < 20; i++) {
				x = buf1 + buf2;
				buf1 = buf2;
				buf2 = x;
				System.out.print(x + ", ");
			}
		}
		{
			/*
			 * 6. Написать программу, которая реализует следующий функционал: 
			 * 6.1 Пользователь вводит число в 10-ой системе счисления.
			 * 6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из
			 * систем счисления на выбор: 1) в 2-ую 2) в 8-ую 3) в 16-ую
			 * 6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий
			 * перевод числа и выводит на экран результат.
			 */
			String s = "";
			Scanner scan = new Scanner(System.in);
			System.out.println("\nInput the number you u want to translate:");
			int num = scan.nextInt();
			System.out.println("Input which notation u want to get (2, 8, 16):");
			int notation = scan.nextInt();
			switch (notation) {
			case 2:
				for (; num > 0; num /= 2) {
					s = (num % 2) + s;
				}
				System.out.println(s);
				break;
			case 8:
				for (; num > 0; num /= 8) {
					s = (num % 8) + s;
				}
				System.out.println(s);
				break;
			case 16:
				int buf;
				for (; num > 0; num /= 16) {
					buf = num % 16;
					if (buf == 10) {
						s = "A" + s;
					} else if (buf == 11) {
						s = "B" + s;
					} else if (buf == 12) {
						s = "C" + s;
					} else if (buf == 13) {
						s = "D" + s;
					} else if (buf == 14) {
						s = "E" + s;
					} else if (buf == 15) {
						s = "F" + s;
					} else {
						s = buf + s;
					}
				}
				System.out.println(s);
				break;
			}

		}

	}

}
