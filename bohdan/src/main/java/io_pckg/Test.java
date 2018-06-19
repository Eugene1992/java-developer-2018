package io_pckg;

import java.io.File;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\admin\\java-developer-2018\\bohdan\\src\\main\\java\\io_pckg\\to_output");

        //Does not print dir's
        if (file.isDirectory()) {
            printInnerByRecursion(file.listFiles());
            System.out.println();
            printInnerByQueue(file.listFiles());
        }
    }

    static void printInnerByRecursion(File[] files) {
        for (File file : files) {
            if (file.isDirectory()) {
                if (file.listFiles() != null) {
                    printInnerByRecursion(file.listFiles());
                } else {
                    System.out.println(file.getPath());
                }
                continue;
            }
            System.out.println(file + " ==> " + file.getName());
        }
    }

    static void printInnerByQueue(File[] files) {
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
                System.out.println(file + " ==> " + file.getName());
            }
        }
    }
}
