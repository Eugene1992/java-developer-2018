package jsoup_task;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class JsoupImpl {

    private String link;

    public JsoupImpl(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Document getPageCode() {
        Document doc = null;
        try {
            doc = Jsoup.connect(link).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return doc;
    }

    public void toHTMLfile(String path) throws IOException {

        Files.write(
                Paths.get(path),
                Arrays.asList(getPageCode().getAllElements())
                        .stream()
                        .map(element -> element.toString())
                        .collect(Collectors.toList())
        );

    }

    public Elements getElementsByCssQuery(String query) {
        return getPageCode().select(query);
    }

    public void getImageToFolder(String path, String src) throws IOException {
        String name = src.substring(src.lastIndexOf('/') + 1, src.length());

        URL url = new URL(src);

        InputStream in = url.openStream();
        OutputStream out = new BufferedOutputStream(new FileOutputStream(path + name));

        for (int b; (b = in.read()) != -1; ) {
            out.write(b);
        }

        System.out.println(name + " has been downloaded");

        out.close();
        in.close();
    }
}
