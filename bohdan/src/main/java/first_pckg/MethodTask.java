package first_pckg;

public class MethodTask {

	public static void printIntervalSum(int begin, int end) {
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			sum += i;
		}
		System.out.println(sum + "\n");
	}

	public static void printPalindromes() {
		int result = 0, count = 0;
		for (int i = 11; i < 10000; i++) {
			int x = i;
			result = 0;
			while (x != 0) {
				result *= 10;
				result += x % 10;
				x /= 10;
			}
			if (result == i) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\nAmount: " + count);
	}

	public static void main(String[] args) {

		printIntervalSum(4, 10);

		printPalindromes();

	}

}
