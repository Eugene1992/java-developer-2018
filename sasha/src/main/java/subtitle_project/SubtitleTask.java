package subtitle_project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SubtitleTask {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ai\\Documents\\java-developer-2018\\sasha\\src\\main\\java\\subtitle_project\\Game.of.Thrones.-.03x02.txt");
        List<String> listWithLetter = returnSubtitlesOnlyWithWords(file);
        writeListToFile(listWithLetter);

        List<String> listWithWords = returnSubtitlesWordsWithMoreThenThreeLetters(listWithLetter);
        writeListToFile(listWithWords);
    }

    public static List<String> returnSubtitlesOnlyWithWords(File file) {
        List<String> subtitles = null;
        try {
            subtitles = Files.lines(Paths.get(file.getAbsolutePath()))
                    .map(s -> s.replaceAll("([0-9:\\-\\,()>]+|<.+?>)", ""))
                    .flatMap(s -> Arrays.stream(s.split(" ")))
                    .filter(s -> s.length() > 0)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return subtitles;
    }

    public static List<String> returnSubtitlesWordsWithMoreThenThreeLetters(List<String> list) {
        List<String> listWithWords = list.stream()
                .filter(s -> s.length() > 2)
                .collect(Collectors.toList());
        return listWithWords;
    }

    public static void writeListToFile(List<String> list) {
        File file = new File("C:\\Users\\ai\\Documents\\java-developer-2018\\sasha\\src\\main\\java\\subtitle_project\\" + list.getClass().getSimpleName() + list.hashCode() + ".txt");
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < list.size(); i++) {
                out.write(list.get(i) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
