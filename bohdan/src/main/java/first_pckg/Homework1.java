package first_pckg;

public class Homework1 {

	public static void main(String[] args) {
		
		/*
		    1. Создать четыре целочисленные переменные типов byte, short, int, long.
			2. Инициализировать переменную типа byte результатом суммы двух любых чисел
			3. Инициализировать переменную типа short  результатом вычитания двух любых чисел
			4. Инициализировать переменную типа int результатом деления двух любых чисел
			5. Инициализировать переменную типа long результатом умножения двух любых чисел
		 */
		byte b = 2+5;
		short s = 10-3;
		int i = 10/2;
		long l = 5*5;
		System.out.println("byte = " + b + "\nshort = " + s + "\nint = " + i + "\nlong = " + l + "\n");
		
		/*
		 	6. Передать переменной типа byte результат суммы двух переменных типа byte
			7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
			8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
		*/
		b = (byte) (b+b);
		System.out.println("byte = " + b);
		b = (byte) ((s+s)/b);
		System.out.println("byte = " + b);
		i = (s/s)*(b/b);
		System.out.println("int = " + i + "\n");
		
		/*
		 	9. Поменять значения двух целочисленных переменных используя третью
			10. Поменять значения двух переменных без использования третей
		*/
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
