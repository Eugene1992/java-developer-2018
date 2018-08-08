package JDBC_pckg.dao_pckg;

import JDBC_pckg.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class EmployeeDaoJpaImpl implements EmployeeDao {


    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public EmployeeDaoJpaImpl() {
        entityManagerFactory = Persistence.createEntityManagerFactory("JDBC_pckg");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public Employee create(Employee employee) {

        entityManager.getTransaction().begin();

        entityManager.persist(employee);

        entityManager.getTransaction().commit();


        return getAll().get(getAll().size() - 1);
    }

    @Override
    public Employee update(Employee employee) {

        entityManager.getTransaction().begin();

        Employee emp = entityManager.find(Employee.class, employee.getId());
        emp = employee;

        entityManager.getTransaction().commit();


        return employee;
    }

    @Override
    public boolean delete(Integer id) {

        entityManager.getTransaction().begin();

        entityManager.remove(id);

        entityManager.getTransaction().commit();


        return true;
    }

    @Override
    public Employee get(Integer id) {

        entityManager.getTransaction().begin();

        Employee emp = entityManager.find(Employee.class, id);

        entityManager.getTransaction().commit();

        return emp;
    }

    @Override
    public List<Employee> getAll() {

        entityManager.getTransaction().begin();

        List<Employee> employees = null;
//        employees = entityManager.createQuery
//                ("SELECT emp FROM employee_filled emp", Employee.class).getResultList();

        entityManager.getTransaction().commit();

        return employees;
    }

    @Override
    public List<Employee> getByName(String name) {

        entityManager.getTransaction().begin();

        List<Employee> employees = null;
//        employees = entityManager.createQuery
//                ("SELECT emp FROM employee_filled emp WHERE first_name = " + name, Employee.class).getResultList();

        entityManager.getTransaction().commit();

        return employees;
    }

    @Override
    public List<Employee> getByPosition(String position) {

        entityManager.getTransaction().begin();

        List<Employee> employees = null;
//        employees = entityManager.createQuery
//                ("SELECT emp FROM employee_filled emp WHERE position = " + position, Employee.class).getResultList();

        entityManager.getTransaction().commit();

        return employees;
    }


    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }

    /*public int getNewId() {
        Statement statement = null;
        ResultSet resultSet = null;

        int newId = 0;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT nextval(id) FROM employee_filled ORDER BY id LIMIT 1;");

            resultSet.next();
            newId = resultSet.getInt(0);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return newId;
    }*/

}

