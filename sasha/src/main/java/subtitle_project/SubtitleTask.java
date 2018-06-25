package subtitle_project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SubtitleTask {
    public static void main(String[] args) {
        try {
            List<String> subtitles = Files.lines(Paths.get("C:\\Users\\sasha\\IdeaProjects\\java-developer-2018\\sasha\\src\\main\\java\\subtitle_project\\Game.of.Thrones.-.03x02.txt"))
                    .map(s -> s.replaceAll("([0-9:\\-\\,()>]+|<.+?>)",""))
                    .flatMap(s -> Arrays.stream(s.split(" ")))
                    .collect(Collectors.toList());

            for (int i = 0; i < subtitles.size(); i++) {
                if (subtitles.get(i).length() == 0) {
                    subtitles.remove(i);
                    i--;
                }
            }

            for (int i = 0; i < subtitles.size(); i++) {
                System.out.println(subtitles.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
