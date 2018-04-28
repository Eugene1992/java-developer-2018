package first_pckg;

public class MethodTask {
	
	public static void printIntervalSum (int begin, int end) {
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		printIntervalSum(4, 10);

	}

}
