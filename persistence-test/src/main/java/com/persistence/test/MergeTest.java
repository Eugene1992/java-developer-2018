package com.persistence.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MergeTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.persistence.test");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Employee yevhenii = new Employee(1, "Yevhenii");
        entityManager.persist(yevhenii);

        System.out.println(entityManager.contains(yevhenii));
        entityManager.detach(yevhenii);
        System.out.println(entityManager.contains(yevhenii));

        entityManager.getTransaction().begin();
        yevhenii.setName("Eugene");
        entityManager.merge(yevhenii);

        entityManager.getTransaction().commit();

        Employee employee = entityManager.find(Employee.class, 1);
        System.out.println(entityManager.contains(yevhenii));
        System.out.println(employee);

        entityManager.close();
        entityManagerFactory.close();
    }
}
