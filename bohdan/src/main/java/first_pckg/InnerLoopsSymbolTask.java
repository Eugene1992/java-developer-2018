package first_pckg;

public class InnerLoopsSymbolTask {

	public static void main(String[] args) {
		String s = "* ";
		
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
		
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(s);
			}
			System.out.println();
		}

	}

}
