package io.decorator;

public class Test {
    public static void main(String[] args) {
        String text = "Hello world!\nHello Earth!";

        BufferedStringReader reader = new BufferedStringReader(new StringReader(text));

        System.out.println(reader.readLine());
        System.out.println(reader.readLine());


    }
}
