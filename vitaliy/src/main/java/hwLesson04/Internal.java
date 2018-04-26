package hwLesson04;

import static javax.swing.JOptionPane.*;

public class Internal {
    /*
    Используя IntelliJ IDEA, создайте класс Interval.
    Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
    промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
    Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
    выводится соответствующее сообщение.
     */
    public static void main(String[] args) {
        int number = Integer.parseInt(showInputDialog("Please, enter your number!"));

        if (number > 0 & number <= 14) {
            showMessageDialog(null, "Your number fell into the numerical interval between 0 - 14");
        } else if (number >= 15 & number <= 35) {
            showMessageDialog(null, "Your number fell into the numerical interval between 15 - 35");
        } else if (number >= 36 & number <= 50) {
            showMessageDialog(null, "Your number fell into the numerical interval between 36 - 50");
        } else if (number > 50 & number <= 100) {
            showMessageDialog(null, "Your number fell into the numerical interval between 50 - 100");
        }
    }
}
