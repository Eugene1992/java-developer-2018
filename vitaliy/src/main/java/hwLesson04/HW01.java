package hwLesson04;
import static javax.swing.JOptionPane.*;
public class HW01 {
    public static void main(String[] args) {
        /*
        1. Создать программу, проверяющую и сообщающую на экран, является ли введенное с
        консоли целое число, чётным либо нечётны
         */

        int number = Integer.parseInt(showInputDialog("Please, input your number!"));
        int result = number%2;
        System.out.println(10%2);
        if(result==0){
            showMessageDialog(null, "You enter even number!");
        }else {
            showMessageDialog(null, "You enter odd number");
        }

    }
}
