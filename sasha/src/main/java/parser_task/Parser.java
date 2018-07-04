package parser_task;

import java.io.*;
import java.net.URL;

public class Parser {
    public static void main(String[] args) {
        String link = "http://flangex.herokuapp.com/io/load";
        downloadHtmlFromLink(link);
    }

    public static void parseImageLinksFromFile(File file) {
//        try {
//            List<String> links = Files.lines(Paths.get(file.getAbsolutePath()))
//                    .map(s -> s.)
//                    .collect(Collectors.toList());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public static File downloadHtmlFromLink(String link) {
        File file = new File("C:\\Users\\ai\\Documents\\java-developer-2018\\sasha\\src\\main\\java\\parser_task\\html_file.html");
        String line;
        BufferedReader in;
        URL url;
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            url = new URL(link);
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            while ((line = in.readLine()) != null) {
                out.write(line + "\n");
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}
