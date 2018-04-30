/*1. Счастливые билетики. Есть билеты с номерами от 000001 до 999999. «Счастливым» считается билетик у которого сумма первых
        трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576. С помощью программы,
        подсчитайте сколько счастливых билетов.*/

package HomeWork4;

public class HomeWork42 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 999999; i++) {
            int a, b, c, d, e, f;
            int num = i;
            a = num % 10;
            num = num / 10;
            b = num % 10;
            num = num / 10;
            c = num % 10;
            num = num / 10;
            d = num % 10;
            num = num / 10;
            e = num % 10;
            num = num / 10;
            f = num % 10;
            num = num / 10;
            if (a + b + c == d + e + f) {
                count = count + 1;
            }
        }
        System.out.println("количество счастливых билетов= " + count);
    }

}
