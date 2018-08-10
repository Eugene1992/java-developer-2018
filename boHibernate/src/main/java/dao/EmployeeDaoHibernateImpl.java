package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import test.Employee;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class EmployeeDaoHibernateImpl implements EmployeeDao {


    private SessionFactory sessionFactory;
    private Session session;

    public EmployeeDaoHibernateImpl() {
        sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();
        session = sessionFactory.openSession();
    }

    @Override
    public Employee create(Employee employee) {

        session.beginTransaction();

        session.save(employee);

        session.getTransaction().commit();

        return null;
    }

    @Override
    public Employee update(Employee employee) {

        session.beginTransaction();

        session.save(employee);

        session.getTransaction().commit();

        return employee;
    }

    @Override
    public boolean delete(Integer id) {

        session.beginTransaction();

        session.remove(get(id));

        session.getTransaction().commit();


        return true;
    }

    @Override
    public Employee get(Integer id) {

        Employee emp = session.get(Employee.class, id);

        return emp;
    }

    @Override
    public List<Employee> getAll() {

        List<Employee> employees = null;
        employees = session.createQuery
                ("FROM Employee emp", Employee.class).getResultList();

        return employees;

    }

    @Override
    public List<Employee> getByName(String name) {

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
        Root<Employee> root = query.from(Employee.class);

        query.select(root).where(criteriaBuilder.equal(root.get("firstName"), name));

        List<Employee> employees = null;
        employees = session.createQuery(query).getResultList();


        return employees;
    }

    @Override
    public List<Employee> getByPosition(String position) {

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
        Root<Employee> root = query.from(Employee.class);

        query.select(root).where(criteriaBuilder.equal(root.get("position"), position));

        List<Employee> employees = null;
        employees = session.createQuery(query).getResultList();

        return employees;

    }


    public void close() {
        session.close();
        sessionFactory.close();
    }

    private Integer getLastId() {
        Integer id = null;

        id = session.createQuery
                ("SELECT id FROM Employee ORDER BY id DESC", Employee.class).getResultList().get(0).getId();


        return id;
    }

}

