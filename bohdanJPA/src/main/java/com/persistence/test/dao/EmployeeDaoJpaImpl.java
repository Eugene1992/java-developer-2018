package com.persistence.test.dao;


import com.persistence.test.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class EmployeeDaoJpaImpl implements EmployeeDao {


    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public EmployeeDaoJpaImpl() {
        entityManagerFactory = Persistence.createEntityManagerFactory("com.persistence.test");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public Employee create(Employee employee) {

        entityManager.getTransaction().begin();

        entityManager.persist(employee);

        entityManager.getTransaction().commit();


        return null;
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

        entityManager.remove(get(id));

        entityManager.getTransaction().commit();


        return true;
    }

    @Override
    public Employee get(Integer id) {

        Employee emp = entityManager.find(Employee.class, id);

        return emp;
    }

    @Override
    public List<Employee> getAll() {


        List<Employee> employees = null;
        employees = entityManager.createQuery
                ("SELECT emp FROM Employee emp", Employee.class).getResultList();


        return employees;
    }

    @Override
    public List<Employee> getByName(String name) {


        List<Employee> employees = null;
        employees = entityManager.createQuery
                ("SELECT emp FROM Employee emp WHERE firstName = " + name, Employee.class).getResultList();


        return employees;
    }

    @Override
    public List<Employee> getByPosition(String position) {


        List<Employee> employees = null;
        employees = entityManager.createQuery
                ("SELECT emp FROM Employee emp WHERE position = " + position, Employee.class).getResultList();


        return employees;
    }


    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }

    private Integer getLastId() {
        Integer id = null;

        id = entityManager.createQuery
                ("SELECT id FROM Employee ORDER BY id DESC", Employee.class).getResultList().get(0).getId();


        return id;
    }

}

