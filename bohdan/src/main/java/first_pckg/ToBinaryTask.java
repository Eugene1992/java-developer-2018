package first_pckg;

public class ToBinaryTask {

	public static void main(String[] args) {
		int x = 20;
		String s = "";
		
		while (x >= 1) {
			s = (x%2) + s;
			x /= 2;
		}
		System.out.println(s);

		
		for (;x >= 1;x /= 2) {
			s = (x%2) + s;
		}		
		System.out.println(s);

	}

}