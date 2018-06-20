package strings;

import java.util.ArrayList;

public class StringsTask {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "worse hell";
        String result = "";
        ArrayList<String> resultsList = new ArrayList<>();
        int k = 0;

        char[] chars1 = str1.toCharArray();


        while (k < str1.length()) {
            result += chars1[k];
            if (str2.contains(result)) {

                k++;
            } else {
                char[] strWithOutLast = result.toCharArray();
                result = "";
                for (int i = 0; i < strWithOutLast.length - 1; i++) {
                    result += strWithOutLast[i];
                }
                resultsList.add(result);
                result = "";
                k++;
            }
        }

        System.out.println(resultsList.toString());
        String maxResult = "";
        for (int i = 0; i < resultsList.size(); i++) {
            if (resultsList.get(i).length() > maxResult.length()) {
                maxResult = resultsList.get(i);
            }
        }
        System.out.println(maxResult);
    }
}
