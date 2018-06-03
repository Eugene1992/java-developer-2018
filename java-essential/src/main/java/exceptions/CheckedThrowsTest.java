package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CheckedThrowsTest {
    public static void main(String[] args) throws FileNotFoundException {
        f();
    }

    static void f() throws FileNotFoundException {
        System.out.println("Start");
        InputStream inputStream = new FileInputStream("dsdsdss");
        System.out.println("After");
        System.out.println("End");
    }
}
