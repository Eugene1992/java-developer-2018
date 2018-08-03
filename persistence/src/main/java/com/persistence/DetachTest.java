package com.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DetachTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.persistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Employee emp = entityManager.find(Employee.class, 1);
        System.out.println("Contains(before detach):" + entityManager.contains(emp));
        //Detach entity
        entityManager.detach(emp);
        System.out.println("Contains(After detach):" + entityManager.contains(emp));

        entityManager.close();
        entityManagerFactory.close();
        System.out.println("Done");
    }
}
