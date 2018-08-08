package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class EmployeeDaoJpaImpl implements EmployeeDao {

    //    public static final String ID = "id";
//    public static final String FIRST_NAME = "first_name";
//    public static final String LAST_NAME = "last_name";
//    public static final String AGE = "age";
//    public static final String SALARY = "salary";
//    public static final String IS_MARRIED = "is_married";
//    public static final String POSITION = "position";
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public EmployeeDaoJpaImpl() {
        entityManagerFactory = Persistence.createEntityManagerFactory("dao");
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

        Employee emp = entityManager.find(Employee.class, employee.idProperty().get());
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

//        List<Employee> employees = entityManager.createQuery("SELECT emp FROM employee_filled emp").getResultList();

        entityManager.getTransaction().commit();

        return null;
    }

    @Override
    public List<Employee> getByName(String name) {

        entityManager.getTransaction().begin();

//        List<Employee> employees = entityManager.createQuery("SELECT emp FROM employee_filled emp WHERE first_name = " + name).getResultList();

        entityManager.getTransaction().commit();

        return null;
    }

    @Override
    public List<Employee> getByPosition(String position) {

        entityManager.getTransaction().begin();

//        List<Employee> employees = entityManager.createQuery("SELECT emp FROM employee_filled emp WHERE position = " + position).getResultList();

        entityManager.getTransaction().commit();

        return null;
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

