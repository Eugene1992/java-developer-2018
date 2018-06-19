package io.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Evgeniy\\Desktop\\java-developer-2018\\java-professional\\src\\main\\java\\io\\sample\\from");
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());

        File notExistedFile = new File("C:\\Users\\Evgeniy\\Desktop\\java-developer-2018\\java-professional\\src\\main\\java\\io\\sample\\xxx.txt");

        if (!notExistedFile.exists()) {
            boolean newFile = notExistedFile.createNewFile();
            System.out.println(newFile);
        }

        File dir = new File("C:\\Users\\Evgeniy\\Desktop\\java-developer-2018\\java-professional\\src\\main\\java\\io\\a");

        File[] files = dir.listFiles();

        for (File curFile : files) {
            System.out.println(curFile.getName());
        }

    }
}
