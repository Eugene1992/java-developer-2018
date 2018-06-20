package strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello world!Hello Earth!";
        String empty = "";
        String allo = "Allo";

        System.out.println("Empty: " + str.isEmpty());
        System.out.println("Empty: " + empty.isEmpty());

        System.out.println(str.compareTo(empty));
        System.out.println(str.equals(empty));

        System.out.println(str.concat("!!"));

        char[] chars = str.toCharArray();
        byte[] bytes = str.getBytes();

        System.out.println(str.substring(2, 6));

        System.out.println(str.startsWith("Hell"));
        System.out.println(str.startsWith("wo", 6));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(str.contains("llo"));
        System.out.println(str.equalsIgnoreCase("HelLO woRLd!"));

        System.out.println(str.endsWith("!"));

        System.out.println(str.charAt(4));
        System.out.println(str.indexOf('w'));
        System.out.println(str.indexOf("wor"));
        System.out.println(str.lastIndexOf("o"));
        System.out.println(str.lastIndexOf("x"));

        System.out.println(str.length());
        System.out.println(str.replace("world", "Earth"));
        System.out.println(str.replaceAll("world", "Earth"));

        System.out.println("     Hello          ".trim());

        String[] split = str.split("[ !]");
        System.out.println(Arrays.toString(split));

    }
}
