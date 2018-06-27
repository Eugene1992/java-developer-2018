package IO;

import java.io.File;
import java.util.PriorityQueue;
import java.util.Queue;

public class Io_Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\begun.v\\Desktop\\java-developer-2018\\slavikbv\\src\\main\\java\\IO\\package");
        //   System.out.println(file.listFiles());
        printRecursion(file.listFiles());
        System.out.println();
        printFile(file.listFiles());
    }

    public static void printRecursion(File[] files) {
        for (File file : files) {
            if (file.listFiles() != null) {
                printRecursion(file.listFiles());
            } else System.out.println("Path = " + file.getPath() + ";  fileName = " + file.getName());
        }
    }

    public static void printFile(File[] files) {
        Queue<File> filesQueue = new PriorityQueue<>();
        for (File file : files) {
            filesQueue.add(file);
        }
        File file;
        while (!filesQueue.isEmpty()) {
            file = filesQueue.poll();
            if (file.isDirectory()) {
                for (File nextFile : file.listFiles()) {
                    filesQueue.add(nextFile);
                }
            } else {
                System.out.println("Path = " + file.getPath() + ";  fileName = " + file.getName());
            }
        }
    }


}
