package JDBC_pckg.dao_pckg;

import JDBC_pckg.Employee;

import java.util.List;

public interface EmployeeDao extends GenericDao<Integer, Employee> {

    List<Employee> getByName(String name);

    List<Employee> getByPosition(String position);

}
