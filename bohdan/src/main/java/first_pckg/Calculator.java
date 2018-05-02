package first_pckg;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("~Sixth task~\nInput two numbers:");
		double a = scan.nextDouble(),
			   b = scan.nextDouble();
		System.out.println("Input the sign of operation u want to apply:");
		String op = scan.next();
		if ("+".equals(op)) {
			System.out.println(a + " " + op + " " + b + " = " + (a + b));

		} else if ("-".equals(op)) {
			System.out.println(a + " " + op + " " + b + " = " + (a - b));

		} else if ("*".equals(op)) {
			System.out.println(a + " " + op + " " + b + " = " + (a * b));

		} else if ("/".equals(op)) {
			if (b == 0)
				System.out.println("Error: / by zero!");
			else
				System.out.println(a + " " + op + " " + b + " = " + (a / b));

		} else if ("^".equals(op)) {
			System.out.println(a + " " + op + " " + b + " = " + (Math.pow(a, b)));

		} else if ("root".equals(op)) {
			System.out.println(a + " " + op + " " + b + " = " + (Math.pow(a, 1 / b)));

		} else {
			System.out.println("There is no function signed/called " + op);
		}
	}

}
