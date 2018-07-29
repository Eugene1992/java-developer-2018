package dao;

public interface EmployeeDao extends GenericDao<Integer, Employee> {
    Employee getByName(String name);
}
