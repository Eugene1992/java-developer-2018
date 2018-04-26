import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i >= 0 && i <= 14)
            System.out.println("Твое число в диапазоне [0 - 14]");
        else if (i >= 15 && i <= 35)
            System.out.println("Твое число в диапазоне [15 - 35]");
        else if (i >= 36 && i <= 49)
            System.out.println("Твое число в диапазоне [36 - 50]");
        else if (i == 50)
            System.out.println("Твое число в диапазоне  [36 - 50] и [50 - 100]");
        else if (i >= 51 && i <= 100)
            System.out.println("Твое число в диапазоне [50 - 35]");
        else
            System.out.println("Твое число за полями[0 - 100]");

    }
}
