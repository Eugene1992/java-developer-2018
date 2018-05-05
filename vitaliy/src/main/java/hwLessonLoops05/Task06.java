package hwLessonLoops05;


import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        System.out.println("Please, enter number what you wanna convert?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Chose algorism to convert you wanna: 2 / 8 / 16?");

        int convert = scanner.nextInt();

        switch (convert) {
            case 2:
                String temp = "";
                while (number != 0) {
                    int a = number % 2;
                    temp = a + temp;
                    number = number / 2;

                }
                System.out.println(temp);
                break;

            case 8:
                String temp8 = "";
                while (number != 0) {
                    int b = number % 8;
                    temp8 = b + temp8;
                    number = number / 8;
                }
                System.out.println(temp8);
                break;

            case 16:
                String temp16 = "";
                while (number != 0) {
                    int c = number % 16;
                    if (c == 10) {
                        temp16 = "A" + temp16;
                    } else if (c == 11) {
                        temp16 = "B" + temp16;
                    } else if (c == 12) {
                        temp16 = "C" + temp16;
                    } else if (c == 13) {
                        temp16 = "D" + temp16;
                    } else if (c == 14) {
                        temp16 = "E" + temp16;
                    } else if (c == 15) {
                        temp16 = "F" + temp16;
                    }

                    number = number / 16;
                }
                System.out.println(temp16);

        }

    }
}
