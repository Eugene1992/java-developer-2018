import java.util.List;

public interface EmployeeDao extends GenericDao<Integer, Employee> {

    List<Employee> getByName(String name);

    List<Employee> getByPosition(String position);

}
