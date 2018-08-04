package com.persistence.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.persistence.test");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        Employee yevhenii = new Employee(1, "Yevhenii");
        entityManager.persist(yevhenii);

        Employee employee = entityManager.find(Employee.class, 1);
        System.out.println(employee);

        entityManager.getTransaction().begin();
        employee.setName("Eugene");
        entityManager.getTransaction().commit();

        Employee employee2 = entityManager.find(Employee.class, 1);
        System.out.println(employee2);

        entityManager.close();
        entityManagerFactory.close();
    }
}
