package conditionals;

public class HomeWork {
    public static void main(String[] args) {
//  1. Создать четыре целочисленные переменные типов byte, short, int, long.
        byte a1 = 127;
        short a2 = 312;
        int a3 = 35800;
        long a4 = 52000000;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
//  2. Инициализировать переменную типа byte результатом суммы двух любых чисел
        byte b1 = 107 + 20;
        byte b2 = 1 + 113;
        System.out.println(b1);
        System.out.println(b2);
//  3. Инициализировать переменную типа short  результатом вычитания двух любых чисел
        short c1 = 954 - 187;
        short c2 = 455 - 234;
        System.out.println(c1);
        System.out.println(c2);
//  4. Инициализировать переменную типа int результатом деления двух любых чисел
        int i = 1000 / 2;
        int i2 = 5400 / 5;
        System.out.println(i);
        System.out.println(i2);
//  5. Инициализировать переменную типа long результатом умножения двух любых чисел
        long l = 6 * 700;
        long l2 = 54 * 3;
        System.out.println(l);
        System.out.println(l2);
//  6. Передать переменной типа byte результат суммы двух переменных типа byte
        byte aA = 33;
        byte bA = 45;
        byte cA = (byte) (aA + bA);
        System.out.println(cA);
//  7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
        short aB = 44;
        short bB = 2;
        byte cB = 2;
        byte dB = (byte) ((aB + bB) / cB);
        System.out.println(dB);
//  8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
        short aQ = 20;
        short bQ = 5;
        byte cQ = 60;
        byte dQ = 15;
        int eQ = (aQ / bQ) * (cQ / dQ);
//  9. Поменять значения двух целочисленных переменных используя третью
        int a = 11;
        int b = 12;
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
//  10. Поменять значения двух переменных без использования третей
        int o = 3;
        int p = 4;
        o = o * p;
        p = o / p;
        o = o / p;
        System.out.println(o);
        System.out.println(p);
    }
}
