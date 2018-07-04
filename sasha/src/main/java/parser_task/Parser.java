package parser_task;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.io.FileOutputStream;
import java.net.URL;

public class Parser {
    public static void main(String[] args) {
        String link = "http://flangex.herokuapp.com/io/load";
        downloadHtmlFromLink(link);
        parseImageLinksFromFile(downloadHtmlFromLink(link));
    }

    public static void parseImageLinksFromFile(File file) {
        Document doc;
        try {
            doc = Jsoup.parse(file, "UTF-8", "");
            Elements links = doc.select("a[href]");
            for (Element elem : links) {
                BufferedInputStream in = new BufferedInputStream(new URL("http://flangex.herokuapp.com" + elem.attr("href")).openStream());
                String fileName = elem.attr("href").split("/")[elem.attr("href").split("/").length - 1];
                FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\sasha\\IdeaProjects\\java-developer-2018\\sasha\\src\\main\\java\\parser_task\\" + fileName);
                byte dataBuffer[] = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                    fileOutputStream.write(dataBuffer, 0, bytesRead);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File downloadHtmlFromLink(String link) {
        File file = new File("C:\\Users\\sasha\\IdeaProjects\\java-developer-2018\\sasha\\src\\main\\java\\parser_task\\html_file.html");
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
