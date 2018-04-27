package hwLesson04;

import static javax.swing.JOptionPane.*;

public class HW03 {
    public static void main(String[] args) {
        /*
        Задано три переменных, найти и вывести на экран переменную с максимальным значением
        (значения всех переменных разные).
         */
        int number1 = Integer.parseInt(showInputDialog("Please, enter your first number"));
        int number2 = Integer.parseInt(showInputDialog("Please, enter your second number"));
        int number3 = Integer.parseInt(showInputDialog("Please, enter your third number"));

        if (number1 > number2 & number1 > number3) {
            showMessageDialog(null,  +number1+ "This is max value number");
        } else if (number2 > number1 & number2 > number3) {
            showMessageDialog(null, +number2+ "This is max value number");
        } else if (number3 > number1 & number3 > number2) {
            showMessageDialog(null, +number3+ "This is max value number");
        }
    }
}
