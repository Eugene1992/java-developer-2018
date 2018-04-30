/*3. Не счастливые номера. Есть 999999 номерных знаков, подсчитать количество знаков содержащих число 13 и вывести их все в консоль*/

package HomeWork4;

public class HomeWork44 {
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
            if (f * 10 + e == 13) {
                if (i < 10) {
                    System.out.println("00000" + i);
                    continue;
                }
                if (i >= 10 && i < 99) {
                    System.out.println("0000" + i);
                    continue;
                }
                if (i >= 100 && i < 999) {
                    System.out.println("000" + i);
                    continue;
                }
                if (i >= 1000 && i < 9999) {
                    System.out.println("00" + i);
                    continue;
                }
                if (i >= 10000 && i < 99999) {
                    System.out.println("0" + i);
                    continue;
                }
                if (i >= 100000) {
                    System.out.println(i);
                    continue;
                }
            }
            if (e * 10 + d == 13) {
                if (i < 10) {
                    System.out.println("00000" + i);
                    continue;
                }
                if (i >= 10 && i < 99) {
                    System.out.println("0000" + i);
                    continue;
                }
                if (i >= 100 && i < 999) {
                    System.out.println("000" + i);
                    continue;
                }
                if (i >= 1000 && i < 9999) {
                    System.out.println("00" + i);
                    continue;
                }
                if (i >= 10000 && i < 99999) {
                    System.out.println("0" + i);
                    continue;
                }
                if (i >= 100000) {
                    System.out.println(i);
                    continue;
                }
            }
            if (d * 10 + c == 13) {
                if (i < 10) {
                    System.out.println("00000" + i);
                    continue;
                }
                if (i >= 10 && i < 99) {
                    System.out.println("0000" + i);
                    continue;
                }
                if (i >= 100 && i < 999) {
                    System.out.println("000" + i);
                    continue;
                }
                if (i >= 1000 && i < 9999) {
                    System.out.println("00" + i);
                    continue;
                }
                if (i >= 10000 && i < 99999) {
                    System.out.println("0" + i);
                    continue;
                }
                if (i >= 100000) {
                    System.out.println(i);
                    continue;
                }
            }
            if (c * 10 + b == 13) {
                if (i < 10) {
                    System.out.println("00000" + i);
                    continue;
                }
                if (i >= 10 && i < 99) {
                    System.out.println("0000" + i);
                    continue;
                }
                if (i >= 100 && i < 999) {
                    System.out.println("000" + i);
                    continue;
                }
                if (i >= 1000 && i < 9999) {
                    System.out.println("00" + i);
                    continue;
                }
                if (i >= 10000 && i < 99999) {
                    System.out.println("0" + i);
                    continue;
                }
                if (i >= 100000) {
                    System.out.println(i);
                    continue;
                }
            }
            if (b * 10 + a == 13) {
                if (i < 10) {
                    System.out.println("00000" + i);
                    continue;
                }
                if (i >= 10 && i < 99) {
                    System.out.println("0000" + i);
                    continue;
                }
                if (i >= 100 && i < 999) {
                    System.out.println("000" + i);
                    continue;
                }
                if (i >= 1000 && i < 9999) {
                    System.out.println("00" + i);
                    continue;
                }
                if (i >= 10000 && i < 99999) {
                    System.out.println("0" + i);
                    continue;
                }
                if (i >= 100000) {
                    System.out.println(i);
                    continue;
                }
            }
        }
    }

}
