package StringMethods;

public class Str {
    public static void main(String[] args) {
        String one = new String("Hello1world");
        String two = new String("   Hello1wor ddd");

        String sovp = "";
        int n = 0;

        for (int i = 0; i < one.length(); i++) {
            for (int j = i; j < one.length() + 1; j++) {
                String element = one.substring(i, j);
                if (two.contains(one.substring(i, j)) && one.substring(i, j).length() > n) {
                    sovp = one.substring(i, j);
                    n = one.substring(i, j).length();
                }
            }
        }
        System.out.println(sovp);
    }
}
