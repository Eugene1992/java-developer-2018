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

    private String fillBuffer(String buffer) {
        System.out.print("\nInsert the name: ");
        buffer += scan.nextLine() + ":";
        System.out.print("Insert the age: ");
        buffer += scan.nextInt() + ":";
        System.out.print("Insert the salary: ");
        buffer += scan.nextInt() + ":";
        System.out.print("Insert the position: ");
        buffer += scan.next();

        return buffer;
    }

    public void create() {
        this.scan = new Scanner(System.in);
        String buffer;
        if (!data.isEmpty()) {
            buffer = (Integer.parseInt(data.get(data.size() - 1).substring(0, 1)) + 1) + ":";
        } else {
            buffer = 1 + ":";
        }

        buffer = fillBuffer(buffer);

        data.add(buffer);

        scan.close();
    }

    public void delete(int id) {
        data.remove(id - 1);
    }

    public void update(int id) {
        this.scan = new Scanner(System.in);
        String buffer = id + ":";

        buffer = fillBuffer(buffer);

        data.set(id - 1, buffer);
        scan.close();
    }

    public void change(int id) {
        String[] buffer = data.get(id - 1).split("[:]");

        scan = new Scanner(System.in);
        System.out.print("Input what do you want to change Name/Age/Salary/Position: ");
        switch (scan.next().toLowerCase()) {
            case "name":
                System.out.println("Input new name: ");
                buffer[1] = scan.next();
                break;
            case "age":
                System.out.println("Input new age: ");
                buffer[2] = scan.next();
                break;
            case "salary":
                System.out.println("Input new salary: ");
                buffer[3] = scan.next();
                break;
            case "position":
                System.out.println("Input new position: ");
                buffer[4] = scan.next();
                break;
            default:
                throw new IllegalArgumentException("You've entered wrong field, only Name/Age/Salary/Position is acceptable.");
        }

        String buf = "";
        for (int i = 0; i < buffer.length; i++) {
            if (i == buffer.length - 1) {
                buf += buffer[i];
                continue;
            }
            buf += buffer[i] + ":";
        }

        data.set(id - 1, buf);

        scan.close();
    }

    private List<String> getSalarylist() {
        List<String[]> buffer = new ArrayList<>();
        for (String datum : data) {
            buffer.add(datum.split("[:]"));
        }

        List<String> salaryList = new ArrayList<>();
        for (String[] data : buffer) {
            salaryList.add(data[3]);
        }

        return salaryList;
    }

    public int getSummarySalary() {

        List<String> salaryList = getSalarylist();

        int sum = salaryList
                .stream()
                .mapToInt(salary -> Integer.parseInt(salary))
                .sum();

        return sum;
    }

    public int getMaxSalary() {

        List<String> salaryList = getSalarylist();

        OptionalInt sum = salaryList
                .stream()
                .mapToInt(salary -> Integer.parseInt(salary))
                .max();

        return sum.getAsInt();
    }

    public int getMinSalary() {

        List<String> salaryList = getSalarylist();

        OptionalInt sum = salaryList
                .stream()
                .mapToInt(salary -> Integer.parseInt(salary))
                .min();

        return sum.getAsInt();
    }
}