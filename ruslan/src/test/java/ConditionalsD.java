import java.util.Scanner;

public class ConditionalsD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числа для сравнения");

        System.out.println("Введите первое число");
        int com1 = scan.nextInt();
        System.out.println("Введите второе число");
        int com2 = scan.nextInt();
        System.out.println("Введите третье число");
        int com3 = scan.nextInt();
        System.out.println("Введите четвёртое число");
        int com4 = scan.nextInt();
//        if (com1 > com2 || com1 < com3 || com1 < com4) {
//            System.out.println(com1);
//        }
//         if (com1 > com3 || com1 < com2 || com1 < com4) {
//            System.out.println(com1);
//        }
//         if (com1 > com4 || com1 < com2 || com1 < com3) {
//            System.out.println(com1);
//        }
        if ((com1 > com2 ^ com1 < com3 ^ com1 < com4) &&
                (com1 > com4 ^ com1 < com2 ^ com1 < com3) &&
                (com1 > com3 ^ com1 < com2 ^ com1 < com4)) {
            System.out.println(com1);
            System.out.println("Второе по величине число");
        }
        if ((com2 > com1 ^ com2 < com3 ^ com2 < com4) &&
                (com2 > com3 ^ com2 < com1 ^ com2 < com4) &&
                (com2 > com4 ^ com2 < com1 ^ com2 < com3)) {
            System.out.println(com2);
            System.out.println("Второе по величине число");
        }
        if((com3 > com1 && com3 < com2 && com3 < com4) &&
                (com3 > com2 ^ com3 < com1 ^ com3 < com4) &&
                (com3 > com4 ^ com3 < com1 ^ com3 < com2)) {
            System.out.println(com3);
            System.out.println("Второе по величине число");
        }
        if ((com4 > com1 || com4 < com2 || com4 < com3) &&
                (com4 > com2 && com4 < com1 && com4 < com3) &&
                (com4 > com3 && com4 < com1 && com4 < com2)) {
            System.out.println(com4);
            System.out.println("Второе по величине число");
        }
    }
}