package first_pckg;

import java.util.Scanner;

public class Interval {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("~Seventh task~\nInput the number (0-100) to compare with intervals:");
		int n = scan.nextInt();
		if (n >= 0 && n <= 14)
			System.out.println("Your number is in [0 - 14].");
		else if (n >= 15 && n <= 35)
			System.out.println("Your number is in [15 - 35].");
		else if (n >= 36 && n <= 49)
			System.out.println("Your number is in [36 - 50].");
		else if (n == 50)
			System.out.println("Your number is in [36 - 50] and [50 - 100].");
		else if (n >= 51 && n <= 100)
			System.out.println("Your number is in [50 - 35].");
		else
			System.out.println("Your number is out of interval [0 - 100].");
				
	}

}
