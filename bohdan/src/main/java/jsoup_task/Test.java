package jsoup_task;


import org.jsoup.nodes.Element;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {

        JsoupImpl jsoup = new JsoupImpl("http://flangex.herokuapp.com/io/load");

        try {
            jsoup.toHTMLfile("C:\\Users\\admin\\java-developer-2018\\bohdan\\src\\main\\java\\jsoup_task\\test.html");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Element element : jsoup.getElementsByCssQuery("a[href]")) {
            Thread myThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        jsoup.getImageToFolder("C:\\Users\\admin\\java-developer-2018\\bohdan\\src\\main\\java\\jsoup_task\\",
                                element.attr("abs:href"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            myThread.start();
        }
    }
}
