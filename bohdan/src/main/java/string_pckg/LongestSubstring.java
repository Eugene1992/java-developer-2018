package string_pckg;

public class LongestSubstring {
    public static void main(String[] args) {
        String first = "Hello world!";
        String second = "Worse hell";

        System.out.println(getLongestSubstring(first, second));
    }

    static String getLongestSubstring(String firstStr, String second) {
        char[] first = firstStr.toCharArray();
        String longestSubstring = "";
        for (int i = 0; i < first.length - 1; i++) {
            for (int j = i + 1; j < first.length; j++) {
                if (second.contains(String.copyValueOf(first, i, j - i)) && longestSubstring.length() < String.copyValueOf(first, i, j - i).length()) {
                    longestSubstring = String.copyValueOf(first, i, j - i);
                }
            }
        }
        return longestSubstring;
    }
}
