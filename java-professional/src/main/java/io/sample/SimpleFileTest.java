package io.sample;

import java.io.*;

public class SimpleFileTest {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "C:\\Users\\Evgeniy\\Desktop\\java-developer-2018\\java-professional\\src\\main\\java\\io\\from";
        String outputFilePath = "C:\\Users\\Evgeniy\\Desktop\\java-developer-2018\\java-professional\\src\\main\\java\\io\\to";

        InputStream inputStream = new FileInputStream(inputFilePath);
        OutputStream outputStream = new FileOutputStream(outputFilePath);
        while (inputStream.available() > 0) {
            int readByte = inputStream.read();
            outputStream.write(readByte);
        }
        inputStream.close();
        outputStream.close();
    }
}
