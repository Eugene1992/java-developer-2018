package com.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MergeTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.persistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //fetch entity
        Employee emp = entityManager.find(Employee.class, 1);
        System.out.println("Name:" + emp.getName() + "," + "City: " + emp.getCity());
        System.out.println("Contains(before detach):" + entityManager.contains(emp));
        //detach entity
        entityManager.detach(emp);
        System.out.println("Contains(After detach):" + entityManager.contains(emp));
        //merge entity
        entityManager.getTransaction().begin();
        emp.setName("Brahma");
        emp.setCity("Kanpur");
        emp = entityManager.merge(emp);
        entityManager.getTransaction().commit();
        System.out.println("Contains(After merge):" + entityManager.contains(emp));
        System.out.println("Name:" + emp.getName() + "," + "City: " + emp.getCity());

        entityManager.close();
        entityManagerFactory.close();
    }
}
