/*
package com.persistence.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistTest {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.persistence.test");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Employee yevhenii = new Employee(1, "Yevhenii");
        entityManager.persist(yevhenii);

        Employee bohdan = new Employee(2, "Bohdan");
        entityManager.persist(bohdan);

        Employee slava = new Employee(3, "Slava");
        entityManager.persist(slava);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }

}
*/
