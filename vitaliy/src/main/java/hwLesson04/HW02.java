package hwLesson04;

import static javax.swing.JOptionPane.*;

public class HW02 {
    public static void main(String[] args) {
        /*
        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
        Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
         */

        double number = Double.parseDouble(showInputDialog("Please, enter your first number!"));
        double number2 = Double.parseDouble(showInputDialog("Please, enter your second number!"));

        double res1 = 10 - number;
        double res2 = 10 - number2;
        double res3 = number - 10;
        double res4 = number2 - 10;

        if (number < 10 & number2 < 10 & res1 < res2) {
            showMessageDialog(null, number + "This number is more closer into 10");
        } else if (number > 10 & number2 > 10 & res3 < res4) {
            showMessageDialog(null, number + "This number is more closer into 10");
        } else if (number < 10 & number2 > 10 & res1 < res4) {
            showMessageDialog(null, number + "This number is more closer into 10");
        } else if (number > 10 & number2 < 10 & res2 < res3) {
            showMessageDialog(null, number2 + "This number is more closer into 10");
        } else if (number < 10 & number2 > 10 & res4 < res1) {
            showMessageDialog(null, number2 + "This number is more closer into 10");
        } else if (number > 10 & number2 < 10 & res3 < res2) {
            showMessageDialog(null, number + "This number is more closer into 10");
        } else if (number < 10 & number2 < 10 & res2 < res1) {
            showMessageDialog(null, number2 + "This number is more closer into 10");
        } else if (number > 10 & number2 > 10 & res4 < res3) {
            showMessageDialog(null, number2 + "This number is more closer into 10");
        }

    }
}
