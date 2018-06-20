package strings;

public class StringIntern {
    public static void main(String[] args) {
        String str1 = "Hello world!";
        String str2 = "Hello world!";
        String str3 = new String("Hello world!");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        str3 = str3.intern();

        System.out.println(str1 == str3);

    }
}
