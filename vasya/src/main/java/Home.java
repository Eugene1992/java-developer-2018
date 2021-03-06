import java.util.Scanner;

public class Home {
    public static void main(String[] args) {

       /* Задание 2
        Создать программу, проверяющую и сообщающую на экран, является ли введенное с
        консоли целое число, чётным либо нечётны
        */
        Scanner scan = new Scanner(System.in);
        {

            System.out.print("Введите число: ");
            int i = scan.nextInt();
            if (i % 2 == 0)
                System.out.println("Ваще число чётное");
            else
                System.out.println("Ваще число не чётное");

        }
        /*
        Задание 3
        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
        Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
        */
        {
            System.out.print("Введите первое число: ");
            float x = scan.nextFloat();
            System.out.print("Введите второе число: ");
            float y = scan.nextFloat();

            if (((x - 10) >= 0 ? x - 10 : -(x - 10)) < ((y - 10) >= 0 ? y - 10 : -(y - 10)))
                System.out.println(" Ближащее число к 10-> " + x);
            else
                System.out.println(" Ближащее число к 10-> " + y);
        }
        /*
        Задание 4
        Задано три переменных, найти и вывести на экран переменную с максимальным значением
        (значения всех переменных разные).
        */
        {
            System.out.println("Введите три переменные");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if (a > (b > c ? b : c))
                System.out.println(a);
            else
                System.out.println(b > c ? b : c);
        }
        /*
        Задание 5
        Задано четыре переменных, найти и вывести на экран вторую по величине.
        */
        {
            System.out.println("Введите четири переменные");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            if (a > b && a > (c > d ? c : d))
                System.out.println(b > (c > d ? c : d) ? b : (c > d ? c : d));
            else if (b > a && b > (c > d ? c : d))
                System.out.println(a > (c > d ? c : d) ? a : (c > d ? c : d));
            else
                System.out.println((c < d ? c : d) > (a > b ? a : b) ? (c < d ? c : d) : (a > b ? a : b));
        }
       /*
       Задание 6
        В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
        будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
        либо сообщать, что корней нет.
       */
        {

            float a = scan.nextFloat();
            float b = scan.nextFloat();
            float c = scan.nextFloat();
            float D = b * b - 4 * a * c;
            if (D < 0)
                System.out.println("Корней нет");
            else if (D == 0)
                System.out.println((-b / (2 * a)));
            else
                System.out.println("x2 = " + (-b + Math.sqrt(D) / (2 * a))
                        + "x2 = " + (-b - Math.sqrt(D) / (2 * a)));
        }
        /*
		Задание 7
		Используя IntelliJ IDEA, создайте класс Calculator.
		Напишите программу - консольный калькулятор.
		Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
		Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
		Выведите на экран результат выполнения арифметической операции.
		В случае использования операции деления, организуйте проверку попытки деления на ноль.
		И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
		пользователя/
		*/
        //Calculator.main(args);

        /*{
            System.out.println("Введите два числа: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("Выберите арефметическое действие:");
            String calc = scan.next();
            switch (calc) {
                case "+":
                    System.out.println((a + b));
                    break;
                case "-":
                    System.out.println((a - b));
                    break;
                case "*":
                    System.out.println((a * b));
                    break;
                case "/":
                    if (b == 0)
                        System.out.println("Нельзя делить на ноль");
                    else
                        System.out.println((a / b));
                    break;
                default:
                    System.out.println("Уведомление об ошибке");

        }*/
        /*
        Задание 8
        Используя IntelliJ IDEA, создайте класс Interval.
        Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
        промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
                Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
        выводится соответствующее сообщение.
                */
        Interval.main(args);
    }


}
