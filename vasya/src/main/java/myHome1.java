public class myHome1 {
    public static void main(String[] args) {

        //1. Создать четыре целочисленные переменные типов byte, short, int, long.

        byte a;
        short b;
        int c;
        long d;

        //2. Инициализировать переменную типа byte результатом суммы двух любых чисел

        a = 10 + 2;
        System.out.println(a);

        //3. Инициализировать переменную типа short  результатом вычитания двух любых чисел

        b = 10 - 2;
        System.out.println(b);

        //4. Инициализировать переменную типа int результатом деления двух любых чисел

        c = 10 / 2;
        System.out.println(c);

        //5. Инициализировать переменную типа long результатом умножения двух любых чисел

        d = 10 * 2;
        System.out.println(d);

        //6. Передать переменной типа byte результат суммы двух переменных типа byte

        byte a1 = 10;
        byte a2 = 2;

        byte a3 = (byte) (a1 + a2);
        System.out.println(a3);


        //7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte

        short b1 = 10;
        short b2 = 2;

        byte a4 = (byte) ((b1 + b2) / a2);
        System.out.println(a4);

        //8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte

        int c1 = (b1 / b2) * (a1 / a2);
        System.out.println(c1);

        //9. Поменять значения двух целочисленных переменных используя третью

        int x=10;
        int y=2;
        int z;

        z=x;
        x=y;
        y=z;

        System.out.println(x);
        System.out.println(y);

        //10. Поменять значения двух переменных без использования третей

        int q=10;
        int w=20;

        w=q+w;
        q=w-q;
        w=w-q;

        System.out.println(q);
        System.out.println(w);

    }
}
