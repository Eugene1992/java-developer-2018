package java_starter.lesson5.loops;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int lowBoundary, highBoundary;
        int randNum, inNum;
        boolean matchFlag = false;

        Random rand = new Random();
        Scanner s = new Scanner(System.in);

        System.out.println("Let's play the Guess Number Game");
        System.out.print("Please, insert your smallest digit:\t");
        lowBoundary = s.nextInt();
        System.out.print("Please, insert your biggest digit:\t");
        highBoundary = s.nextInt();

        while (!matchFlag) {
            System.out.println("Please, enter your number [" + lowBoundary + ".." + highBoundary + "]:");
            inNum = s.nextInt();
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
