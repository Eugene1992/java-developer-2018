package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CheckedTryCatchTest {
    public static void main(String[] args) {
        try {
            System.out.println("Start");
            InputStream inputStream = new FileInputStream("dsdsdss");
            System.out.println("After");
        } catch (FileNotFoundException e) {
            System.out.println("Try");
//            e.printStackTrace();
        }
        System.out.println("End");
    }
}
