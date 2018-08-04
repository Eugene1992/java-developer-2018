package com.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindDemo {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.persistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Employee emp = entityManager.find(Employee.class, 1);
        System.out.println("Name:" + emp.getName() + ", City:" + emp.getCity());

        entityManager.close();
        entityManagerFactory.close();
    }
}
