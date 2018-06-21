package file_CRUD_stream_task;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\admin\\java-developer-2018\\bohdan\\src\\main\\java\\file_CRUD_stream_task\\employeeList");
        Scanner scan = new Scanner(System.in);

        CrudImpl crud = new CrudImpl(file);

        try {
            crud.getData();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Data:");
        crud.printData();

        System.out.println("\nSummary salary:");
        System.out.println(crud.getSummarySalary());

        System.out.println("\nMaximal salary:");
        System.out.println(crud.getMaxSalary());

        System.out.println("\nMinimal salary:");
        System.out.println(crud.getMinSalary());

        System.out.println("\nInsert one of the Create/Read/Update/Delete actions to do with employee list:");
        String action = scan.nextLine();

        switch (action.toLowerCase()) {
            case "create":
                crud.create();
                break;
            case "update":
                System.out.print("Input the ID: ");
                crud.update(scan.nextInt());
                break;
            case "delete":
                System.out.print("Input the ID: ");
                crud.delete(scan.nextInt());
                break;
            default:
                throw new IllegalArgumentException("You've entered wrong action, only CRUD functions is acceptable.");
        }

        try {
            crud.setData();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
