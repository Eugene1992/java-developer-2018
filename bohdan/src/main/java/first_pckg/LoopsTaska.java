package first_pckg;

import java.util.*;

public class LoopsTaska {
	static void printSumOneToHundred() {
		int x = 0;
		for (int i = 1; i <= 100; i++) {
			x += i;
		}
		System.out.println(x);
	}

	static void guessNumberGame() {
		Scanner scan = new Scanner(System.in);
		int a = -1;
		Random rand = new Random();
		int num = rand.nextInt(100) + 1;
		// System.out.println(num);
		System.out.println("Try to guess my number from 1 to 100:");
		while (true) {
			a = scan.nextInt();
			if (a == num) {
				System.out.println("Grats, you are right, my number is " + num);
				break;
			} else if (a > num) {
				System.out.println("Try to take less:");
			} else {
				System.out.println("Try to take greater:");
			}
		}
	}

	public static void main(String[] args) {
		// sout 1+...+100:
		printSumOneToHundred();

		// "Guess number" game:
		guessNumberGame();
	}

}
