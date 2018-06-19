package string;

public class LongestSubstring {
    public static void main(String[] args) {
        String first = "Hello world!";
        String second = "Worse hell";

        System.out.println(getLongestSubstring(first.toCharArray(), second));
    }

    static String getLongestSubstring(char[] first, String second) {
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
