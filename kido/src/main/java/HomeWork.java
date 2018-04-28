public class HomeWork {
    // 1. Создать четыре целочисленные переменные типов byte, short, int, long.

    public static void main(String[] args) {
        byte b1 = 96;
        short c1 = 1027;
        int r1 = -655;
        long e1 = 99999999999L;
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(r1);
        System.out.println(e1);

    // 2. Инициализировать переменную типа byte результатом суммы двух любых чисел

//        byte b1 = (byte) (156 - 1);
        byte bQ = 61 + 53;
        System.out.println(bQ);


    //3. Инициализировать переменную типа short  результатом вычитания двух любых чисел

        short eQ = 30021 - 14965;
        System.out.println(eQ);


    //4. Инициализировать переменную типа int результатом деления двух любых чисел

        int w1 = 16 / 3;
        System.out.println(w1);


    //5. Инициализировать переменную типа long результатом умножения двух любых чисел

        long y1 = 10000000L * 431;
        System.out.println(y1);

    //6. Передать переменной типа byte результат суммы двух переменных типа byte

        byte a = 43;
        byte b = 48;
        byte c = (byte) (a + b);

        System.out.println(c);


    //7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte

        short aR = 21;
        short bR = 15;
        byte m = 2;
        byte r = (byte) ((aR + bR) / m);


        System.out.println(r);

    //8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte

        short a2 = 21;
        short b2 = 3;
        byte m2 = 16;
        byte r2 = 2;
        int j = (a / b) * (m / r);


        System.out.println(j);

    // 9. Поменять значения двух целочисленных переменных используя третью

        int a3 = 21;
        int b3 = 15;
        int c3;
        c3 = a3;
        a3 = b3;
        b3 = c3;
        System.out.println(a3);
        System.out.println(b3);

    // 10. Поменять значения двух переменных без использования третей

        int a4 = 21;
        int b4 = 15;
        b4 = a4 + b4;
        a4 = b4 - a4;
        b4 = b4 - a4;
        System.out.println(a4);
        System.out.println(b4);
    }
}

