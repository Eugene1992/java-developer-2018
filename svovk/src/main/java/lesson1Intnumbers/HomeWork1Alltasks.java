package lesson1Intnumbers;

public class HomeWork1Alltasks {
    public static void main(String[] args) {
        //1. Создать четыре целочисленные переменные типов byte, short, int, long.

        byte a = 1;
        short b = 10;
        int c = 100;
        long d = 100500;

        //2. Инициализировать переменную типа byte результатом суммы двух любых чисел

        a = (byte) (b + c);
        System.out.println(a);

        //3. Инициализировать переменную типа short  результатом вычитания двух любых чисел

        b = 1 + 17;

        //4. Инициализировать переменную типа int результатом деления двух любых чисел

        c = (int) d / b;

        //5. Инициализировать переменную типа long результатом умножения двух любых чисел

        d = a * b;
        //6. Передать переменной типа byte результат суммы двух переменных типа byte

        a = (byte) (a + a);

        //7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte

        a = (byte) ((c + c) / a);

        System.out.print(a);

        //8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte

        c = (int) (1);

        //9. Поменять значения двух целочисленных переменных используя третью


        int f = 120;
        int g = 15;
        int h;

        h = f;
        f = g;
        g = h;

        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        //10. Поменять значения двух переменных без использования третей

        int num1 = 2;
        int num2 = 4;

        num1 = num2;
        num2 = num1 + num1;
        num2 = num1 / num2;

        System.out.println(num1);
        System.out.println(num2);
    }

}
