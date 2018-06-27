package streamAPI_pckg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class WordCounter {
    public static void main(String[] args) {

        Map<String, Long> countedWords = null;
        try {
            countedWords = countWords();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(countedWords);

        File file = new File("C:\\Users\\admin\\java-developer-2018\\bohdan\\src\\main\\java\\streamAPI_pckg\\countedWords");
        try {
            writeToFile(file, countedWords);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Map<String, Long> countWords() throws IOException {

        Map<String, Long> countedWords = Files
                .lines(Paths.get("C:\\Users\\admin\\Desktop\\GOT.txt"))
                .map(line -> line.replaceAll("[^a-zA-Z ]+", " "))
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .map(word -> word.trim().toLowerCase())
                .map(word -> word.length() > 3 ? word : "NULL")
                .collect(Collectors.groupingBy(word -> word.toString(), Collectors.counting()));

        return countedWords;
    }

    public static void writeToFile(File file, Map countedWords) throws IOException {

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter writer = new BufferedWriter(fileWriter);

        Set<String> keys = countedWords.keySet();

        List<String> data = new ArrayList<>();
        for (String key : keys) {
            data.add(key + " ==> " + countedWords.get(key));
        }

        /*data.sort(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return Integer.parseInt(str1.substring(str1.lastIndexOf(' '), str1.length() - 1))
                        - Integer.parseInt(str2.substring(str2.lastIndexOf(' '), str2.length() - 1));
            }
        });*/


/*        data
                .stream()
//                .sorted(Comparator.comparingInt(str -> Integer.parseInt(str.substring(str.lastIndexOf(' '), str.length() - 1))))
                .forEach(writer::write);*/

        List<String> sortedData = new ArrayList<>();
        for (String datum : data) {
            sortedData.add(datum);
        }
        sortedData.sort(Comparator.comparingInt(str -> Integer.parseInt(str.substring(str.lastIndexOf(' ') + 1, str.length()))));
        for (String datum : sortedData) {
            writer.write(datum);
            writer.newLine();
        }

        writer.close();
        fileWriter.close();
    }
}
