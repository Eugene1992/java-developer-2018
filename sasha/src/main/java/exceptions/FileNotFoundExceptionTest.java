package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionTest {
    public static void main(String[] args) {
        try {
            File file = new File("Z://test.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
    }
}
