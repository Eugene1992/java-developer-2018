package com.persistence.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DetachTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.persistence.test");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Employee yevhenii = new Employee(1, "Yevhenii");
        entityManager.persist(yevhenii);

        System.out.println(entityManager.contains(yevhenii));

        entityManager.detach(yevhenii);

        System.out.println(entityManager.contains(yevhenii));

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
