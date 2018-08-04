package com.persistence.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ContainsTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.persistence.test");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Employee yevhenii = new Employee(1, "Yevhenii");
        entityManager.persist(yevhenii);

        System.out.println(entityManager.contains(yevhenii));

        Employee slava = new Employee(2, "Slava");

        System.out.println(entityManager.contains(slava));

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
