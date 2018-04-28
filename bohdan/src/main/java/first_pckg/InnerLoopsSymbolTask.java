package first_pckg;

public class InnerLoopsSymbolTask {
	static void printSquare(String s) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}

	static void printTriangle(String s) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String s = "* ";
		printSquare(s);
		System.out.println();
		printTriangle(s);

	}

}
