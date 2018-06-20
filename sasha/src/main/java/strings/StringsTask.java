package strings;

public class StringsTask {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "worse hell";

        System.out.println(returnTheBigestStringsMatch(str1, str2));
    }

    public static String returnTheBigestStringsMatch(String str1, String str2) {
        String result = "";

        for (int i = 0; i < str1.length() - 1; i++) {
            for (int j = i; j < str1.length(); j++) {
                if (str2.contains(str1.substring(i, j + 1)) && str1.substring(i, j + 1).length() >= result.length()) {
                    result = str1.substring(i, j + 1);
                }
            }
        }

        return result;
    }
}
