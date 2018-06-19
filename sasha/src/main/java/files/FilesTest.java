package files;

import java.io.File;
import java.util.ArrayList;

public class FilesTest {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\ai\\Documents\\java-developer-2018\\sasha\\src\\main\\java\\files");


        System.out.println("Task DIR: " + dir.getName());
        System.out.println("===========================");
        /**
         Recursive variant
         */
        findAllFilesRecursiveVariant(dir, dir.getName());

        System.out.println("Task DIR: " + dir.getName());
        System.out.println("===========================");
        /**
         Simple variant
         */
//        System.out.println(dir.);
        findAllFilesSimpleVariant(dir);

    }

    public static void findAllFilesRecursiveVariant(File dir, String path) {
        File[] listFiles = dir.listFiles();
        for (File listFile : listFiles) {
            if (listFile.isDirectory()) {
                findAllFilesRecursiveVariant(listFile, path + " / " + listFile.getName());
            } else {
                System.out.println(path + " / " + listFile.getName());
            }
        }
    }

    public static void findAllFilesSimpleVariant(File dir) {
        ArrayList fileList = new ArrayList();
        File[] listFiles = dir.listFiles();

        for (File file : listFiles) {
            fileList.add(file);
        }

        for (int i = 0; i < fileList.size(); i++) {
            System.out.println(" / " + listFiles[i].getName());
        }
    }
}
