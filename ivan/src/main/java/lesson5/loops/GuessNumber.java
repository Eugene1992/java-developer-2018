package lesson5.loops;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int randNum, inNum;
        int lowBoundary = 2;
        int highBoundary = 4;
        boolean matchFlag = false;

        Random rand = new Random();
        Scanner s = new Scanner(System.in);

        while (!matchFlag) {
            System.out.println("Please, enter your number [" + lowBoundary + ".." + highBoundary + "]:");
            inNum = s.nextInt();
            // randNum = rand.nextInt(10) + 1;
            randNum = rand.nextInt(highBoundary - lowBoundary + 1) + lowBoundary;

            if (inNum == randNum) {
                System.out.println("Hooray!!! You guessed rand number: [" + randNum + "]");
                matchFlag = true;
            } else {
                System.out.println("Don't be sad, but this time you failed. " +
                        "Input number: [" + inNum + "]; Random number: [" + randNum + "]; " +
                        "Let's try once more");
            }
        }
        System.out.println("Game finished!");
    }
}
