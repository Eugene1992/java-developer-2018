package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String str = "y";

//        Pattern pattern = Pattern.compile("[a-zA-Z0-9-_]{2,20}@[a-zA-Z]{2,10}(.[a-z]{2,3}){1,3}");
//        Pattern pattern = Pattern.compile("[\\w-]{2,20}@[a-zA-Z]{2,10}x`{1,3}");
//        Pattern pattern = Pattern.compile("\\.");
        Pattern pattern = Pattern.compile("[a-c]|[x-z]");

        Matcher matcher = pattern.matcher(str);

        System.out.println(matcher.matches());

    }
}
