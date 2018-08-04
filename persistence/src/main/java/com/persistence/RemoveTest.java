package com.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoveTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.persistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Employee emp = entityManager.find(Employee.class, 1);
        //start removing
        entityManager.getTransaction().begin();
        entityManager.remove(emp);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
