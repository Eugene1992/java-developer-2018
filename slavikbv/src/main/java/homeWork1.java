public class homeWork1 {
    public  static void main (String[] args){
     /*   1. Создать четыре целочисленные переменные типов byte, short, int, long.
        2. Инициализировать переменную типа byte результатом суммы двух любых чисел
        3. Инициализировать переменную типа short  результатом вычитания двух любых чисел
        4. Инициализировать переменную типа int результатом деления двух любых чисел
        5. Инициализировать переменную типа long результатом умножения двух любых чисел
        6. Передать переменной типа byte результат суммы двух переменных типа byte
        7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
        8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
        9. Поменять значения двух целочисленных переменных используя третью
        10. Поменять значения двух переменных без использования третей*/


        /*   1. Создать четыре целочисленные переменные типов byte, short, int, long.*/
        byte a;
        short b;
        int c;
        long d;

        /*   2. Инициализировать переменную типа byte результатом суммы двух любых чисел*/
        byte ab = 12+24;

        /*   3. Инициализировать переменную типа short  результатом вычитания двух любых чисел  */
        short bb=854-24985;

        /*  4. Инициализировать переменную типа int результатом деления двух любых чисел   */
        int cc = 258/43;

        /*  5. Инициализировать переменную типа long результатом умножения двух любых чисел   */
        long dd = 359*58666666L;

        /*  6. Передать переменной типа byte результат суммы двух переменных типа byte */
        byte ac = 14, ad = 18;
        byte ae = (byte)(ac + ad);

        /*   7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte  */
        short ba = 825, bc = 285;
        byte bd = (byte)((ba+bc)/ac);

        /*  8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte */
        short ca =158, cb = 95;
        byte cf = 12, cd = 29;

        int ce = ca/cb*cf/cd;

        /*  9. Поменять значения двух целочисленных переменных используя третью */
        int k=5,l=3,m;
        m=k; k=l; l = m;
        System.out.println(k +""+l);

        /*  10. Поменять значения двух переменных без использования третей */
        int n=5,p=3;
        n=n+p;
        p=n-p;
        n=n-p;
        System.out.println(n+""+p);
    }
}
