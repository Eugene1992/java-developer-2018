package JDBC_pckg.dao_pckg;

import JDBC_pckg.Employee;

public class EmployeeDaoTest {

    public static void main(String[] args) {

        EmployeeDaoImpl crud = new EmployeeDaoImpl();

        System.out.println("DB List:");
        for (Employee employee : crud.getAll()) {
            System.out.println(employee);
        }

        System.out.println();

        System.out.println("Getting by ID (3 = Goga):");
        System.out.println(crud.get(3));

        System.out.println();

        System.out.println("Creating Fuzzy Wuzzy:");
        System.out.println(crud.create(new Employee
                ("Fuzzy", "Wuzzy", 25, 20000, false, "Junior Java Developer")));

        System.out.println();

        System.out.println("Updating Fuzzy Wuzzy:");
        System.out.println(crud.update(new Employee
                (48, "Fuzzy", "Wuzzy", 25, 31000, true, "Middle Java Developer")));

        System.out.println();

        System.out.println();

//        ~Deleting~ (works)
//        crud.delete(13);

        System.out.println("John's in DB:");
        for (Employee john : crud.getByName("John")) {
            System.out.println(john);
        }

        System.out.println();

        System.out.println("Juniors in DB:");
        for (Employee junior : crud.getByPosition("Junior Java Developer")) {
            System.out.println(junior);
        }

        crud.close();
    }

}
