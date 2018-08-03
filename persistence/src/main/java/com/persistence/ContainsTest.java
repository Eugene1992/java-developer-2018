package com.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ContainsTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.persistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Employee emp1 = entityManager.find(Employee.class, 1);
        System.out.println(entityManager.contains(emp1));
        Employee emp2 = new Employee(2, "Suresh", "New Delhi");
        System.out.println(entityManager.contains(emp2));

        entityManager.close();
        entityManagerFactory.close();
        System.out.println("Done");
    }
}
