package subtitle_project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SubtitleTask {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\sasha\\IdeaProjects\\java-developer-2018\\sasha\\src\\main\\java\\subtitle_project\\Game.of.Thrones.-.03x02.txt");
        List<String> listWithLetter = returnSubtitlesOnlyWithLetters(file);
        writeListToFile(listWithLetter);

        List<String> listWithWords = returnSubtitlesWordsSatisfyPredicate(file, s -> s.length() > 2);
        System.out.println("Words in subtitles: " + listWithWords.size());
        writeListToFile(listWithWords);

        Map<Object, Long> repeatWordsMap = countRepeatWords(listWithWords);
        System.out.println("Unic Words in subtitles: " + repeatWordsMap.size());
    }

    public static List<String> returnSubtitlesOnlyWithLetters(File file) {
        List<String> subtitles = null;
        try {
            subtitles = Files.lines(Paths.get(file.getAbsolutePath()))
                    .map(s -> s.replaceAll("([0-9:\\-\\,()>\\.?!]+|<.+?>)", ""))
                    .flatMap(s -> Arrays.stream(s.split(" ")))
                    .filter(s -> s.length() > 0)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return subtitles;
    }

    public static List<String> returnSubtitlesWordsSatisfyPredicate(File file, Predicate<String> predicate) {
        return returnSubtitlesOnlyWithLetters(file).stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static Map<Object, Long> countRepeatWords(List<String> list) {
        Map<Object, Long> repeatWordsMap = list.stream()
                .map(s -> s.trim().toLowerCase())
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        repeatWordsMap = sortByValue(repeatWordsMap);

        File file = new File("C:\\Users\\sasha\\IdeaProjects\\java-developer-2018\\sasha\\src\\main\\java\\subtitle_project\\" + repeatWordsMap.getClass().getSimpleName() + repeatWordsMap.hashCode() + ".txt");
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            repeatWordsMap.forEach((k, v) -> {
                try {
                    out.write(k + " => " + v + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return repeatWordsMap;
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    public static void writeListToFile(Collection<String> list) {
        File file = new File("C:\\Users\\sasha\\IdeaProjects\\java-developer-2018\\sasha\\src\\main\\java\\subtitle_project\\" + list.getClass().getSimpleName() + list.hashCode() + ".txt");
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                out.write(iterator.next() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
