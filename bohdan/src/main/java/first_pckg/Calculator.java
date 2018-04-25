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
		switch (op) {
			case "+":
				System.out.println(a + " " + op + " " + b + " = " + (a+b));
				break;
			case "-":
				System.out.println(a + " " + op + " " + b + " = " + (a-b));
				break;
			case "*":
				System.out.println(a + " " + op + " " + b + " = " + (a*b));
				break;
			case "/":
				if (b == 0)
					System.out.println("Error: / by zero!");
				else
					System.out.println(a + " " + op + " " + b + " = " + (a/b));
				break;
			case "^":
				System.out.println(a + " " + op + " " + b + " = " + (Math.pow(a, b)));
				break;
			case "root":
				System.out.println(a + " " + op + " " + b + " = " + (Math.pow(a, 1 / b)));
				break;
			default:
				System.out.println("There is no function signed/called " + op);
		}
	}

}
