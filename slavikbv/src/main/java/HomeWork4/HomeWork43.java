/*2. Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается так, что
слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).*/
package HomeWork4;

public class HomeWork43 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j < 59; j++) {
                int a, b, c, d;
                int clock = i, min = j;
                a = clock % 10;
                clock = clock / 10;
                b = clock % 10;
                c = min % 10;
                min = min / 10;
                d = min % 10;
                if (a == c && b == d || a == d && b == c) {
                    count = count + 1;
                    System.out.println("время: " + b + a + ":" + d + c);
                }
            }
        }
        System.out.println(count + " комбинаций");
    }
}
