package first_pckg;

public class ToBinaryTask {

	static void toBinary(int x) {
		/*
		 * while (x > 0) {
		 * 	  s = (x % 2) + s;
		 *    x /= 2;
		 * }
		 * System.out.println(s);
		 */
		String s = "";
		for (; x > 0; x /= 2) {
			s = (x % 2) + s;
		}
		System.out.println(s);
	}

	public static void main(String[] args) {
		int x = 20;

		toBinary(x);

	}

}
