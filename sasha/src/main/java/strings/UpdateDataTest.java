package strings;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UpdateDataTest {
    public static void main(String[] args) {
        File data = new File("C:\\Users\\sasha\\IdeaProjects\\java-developer-2018\\sasha\\src\\main\\java\\data");

//        List<Employee> testEmployees = getDataFromFile(data);
//        for (int i = 0; i < testEmployees.size(); i++) {
//            System.out.println(testEmployees.get(i).toString());
//        }

        showData(data);
        System.out.println("========");
        addData(data, "Sasha", 25, 2000, "QA");
        addData(data, "Sasha", 25, 2000, "QA");
        addData(data, "Sasha", 25, 2000, "QA");
        showData(data);
        removeDataByIndex(data, 1);
        showData(data);
        System.out.println(getDataByIndex(data, 0));
        changeDataByIndex(data, 5, "Oleg", 65,100000,"Dev");
    }

    public static void addData(File file, String name, int age, int salary, String position) {
        List<Employee> employees = getDataFromFile(file);
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            employees.add(new Employee(0, name, age, salary, position));
            for (int i = 0; i < employees.size(); i++) {
                employees.get(i).setIndex(i + 1);
                out.write(employees.get(i).toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("No such File");
        }
    }

    public static void removeDataByIndex(File file, int index) {
        List<Employee> employees = getDataFromFile(file);
        employees.remove(index - 1);
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < employees.size(); i++) {
                employees.get(i).setIndex(i + 1);
                out.write(employees.get(i).toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("No such File");
        }
    }

    public static String getDataByIndex(File file, int index) {
        List<Employee> employees = getDataFromFile(file);
        return employees.get(index).toString();
    }

    public static void changeDataByIndex(File file, int index, String name, int age, int salary, String position) {
        List<Employee> employees = getDataFromFile(file);
        employees.set(index - 1, new Employee(0, name, age, salary, position));
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < employees.size(); i++) {
                employees.get(i).setIndex(i + 1);
                out.write(employees.get(i).toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("No such File");
        }
    }

    public static List<Employee> getDataFromFile(File file) {
        List<Employee> employees = new ArrayList<Employee>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineData = line.split(":");
                employees.add(new Employee(Integer.parseInt(lineData[0]), lineData[1], Integer.parseInt(lineData[2]), Integer.parseInt(lineData[3]), lineData[4]));
            }
        } catch (IOException e) {
            System.out.println("No such File");
        }
        return employees;
    }

    public static void showData(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("No such File");
        }
    }
}
