/*5. Выведите на экран первые 20 членов последовательности Фибоначчи.*/
package HomeWork3;

public class HomeWork35 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        int b = 1;
        System.out.println(a);
        int c;
        for (int i = 1; i <= 20; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }
    }
}
