package JDBC_pckg.dao_pckg;

import JDBC_pckg.Employee;

public class GenericDaoTest {

    public static void main(String[] args) {

        GenericDaoImpl<Integer, Employee> crud = new GenericDaoImpl("employee_filled", Employee.class);

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
                (43, "Fuzzy", "Wuzzy", 25, 31000, true, "Middle Java Developer")));

        System.out.println();

        System.out.println();

//        System.out.println(crud.delete(20));

        crud.close();
    }

}
