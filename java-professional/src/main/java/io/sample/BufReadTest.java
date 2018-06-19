package io.sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufReadTest {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\Evgeniy\\Desktop\\java-developer-2018\\java-professional\\src\\main\\java\\io\\sample\\from");
        BufferedReader reader = new BufferedReader(fileReader);
        while (reader.ready()) {
            System.out.println(reader.readLine());
        }
        reader.close();
    }
}
