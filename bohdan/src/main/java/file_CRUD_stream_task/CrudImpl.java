package file_CRUD_stream_task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;

public class CrudImpl {
    private List<String> data;
    private Scanner scan;
    private File file;

    public CrudImpl(File file) {
        this.file = file;
        this.data = new ArrayList<>();
    }

    public void getData() throws IOException {
        FileReader fileReader = new FileReader(file.getPath());
        BufferedReader reader = new BufferedReader(fileReader);

        while (reader.ready()) {
            data.add(reader.readLine());
        }

        reader.close();
    }

    public void printData() {
        System.out.println(data);
    }

    public void setData() throws IOException {
        FileWriter fileWriter = new FileWriter(file.getPath());
        BufferedWriter writer = new BufferedWriter(fileWriter);

        for (int i = 0; i < data.size(); i++) {
            /*for (Character datum : data.get(i).toCharArray()) {
                writer.write(datum);
            }*/
            writer.write(data.get(i) + "\n");
//            writer.newLine();
        }

        writer.close();
    }

    public void create() {
        this.scan = new Scanner(System.in);
        String buffer;
        if (!data.isEmpty()) {
            buffer = ((int) data.get(data.size() - 1).charAt(0) + 1) + ":";
        } else {
            buffer = 1 + ":";
        }

        System.out.print("\nInsert the name: ");
        buffer += scan.nextLine() + ":";
        System.out.print("Insert the age: ");
        buffer += scan.nextInt() + ":";
        System.out.print("Insert the salary: ");
        buffer += scan.nextInt() + ":";
        System.out.print("Insert the position: ");
        buffer += scan.next();

        data.add(buffer);

        System.out.println(data);
        scan.close();
    }

    public void delete(int id) {
        data.remove(id - 1);
    }

    public void update(int id) {
        this.scan = new Scanner(System.in);
        String buffer = id + ":";

        System.out.print("\nInsert the name: ");
        buffer += scan.nextLine() + ":";
        System.out.print("Insert the age: ");
        buffer += scan.nextInt() + ":";
        System.out.print("Insert the salary: ");
        buffer += scan.nextInt() + ":";
        System.out.print("Insert the position: ");
        buffer += scan.next();

        data.set(id - 1, buffer);
        scan.close();
    }

    public int getSummarySalary() {
        List<String[]> buffer = new ArrayList<>();
        for (String datum : data) {
            buffer.add(datum.split("[:]"));
        }

        List<String> salaryList = new ArrayList<>();
        for (String[] data : buffer) {
            salaryList.add(data[3]);
        }

        int sum = salaryList
                .stream()
                .mapToInt(salary -> Integer.parseInt(salary))
                .sum();

        return sum;
    }

    public int getMaxSalary() {
        List<String[]> buffer = new ArrayList<>();
        for (String datum : data) {
            buffer.add(datum.split("[:]"));
        }

        List<String> salaryList = new ArrayList<>();
        for (String[] data : buffer) {
            salaryList.add(data[3]);
        }

        OptionalInt sum = salaryList
                .stream()
                .mapToInt(salary -> Integer.parseInt(salary))
                .max();

        return sum.getAsInt();
    }

    public int getMinSalary() {
        List<String[]> buffer = new ArrayList<>();
        for (String datum : data) {
            buffer.add(datum.split("[:]"));
        }

        List<String> salaryList = new ArrayList<>();
        for (String[] data : buffer) {
            salaryList.add(data[3]);
        }

        OptionalInt sum = salaryList
                .stream()
                .mapToInt(salary -> Integer.parseInt(salary))
                .min();

        return sum.getAsInt();
    }
}