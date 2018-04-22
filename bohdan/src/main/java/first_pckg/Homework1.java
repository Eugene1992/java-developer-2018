package first_pckg;

public class Homework1 {

	public static void main(String[] args) {
		
		byte b = 2+5;
		short s = 10-3;
		int i = 10/2;
		long l = 5*5;
		System.out.println("byte = " + b + "\nshort = " + s + "\nint = " + i + "\nlong = " + l + "\n");
		
		b = (byte) (b+b);
		System.out.println("byte = " + b);
		b = (byte) ((s+s)/b);
		System.out.println("byte = " + b);
		i = (s/s)*(b/b);
		System.out.println("int = " + i + "\n");
		
		System.out.println("int = " + i + "\nlong = " + l + "\n");
		int buf=i;
		i = (int) l;
		l = buf;
		System.out.println("int = " + i + "\nlong = " + l);
		i=(int) (i+l);
		l=l-i;
		l=-l;
		i=(int) (i-l);
		System.out.println("int = " + i + "\nlong = " + l);

	}

}
