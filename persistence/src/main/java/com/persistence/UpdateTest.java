package com.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.persistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Employee emp = entityManager.find(Employee.class, 1);
        System.out.println("Name:" + emp.getName() + ", City:" + emp.getCity());

        //start updating
        entityManager.getTransaction().begin();
        emp.setName("Krishna");
        emp.setCity("Allahabad");
        entityManager.getTransaction().commit();

        emp = entityManager.find(Employee.class, 1);
        entityManager.close();
        entityManagerFactory.close();

        System.out.println("Name:" + emp.getName() + ", City:" + emp.getCity());
        System.out.println("Entity updated.");
    }
}
