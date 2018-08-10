package relations.one_to_one;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.getTransaction().begin();

        Address address = new Address("Marii Raskoboy 15");
        session.save(address);

        Employee employee = new Employee("Yevhenii", address);
        session.save(employee);

        session.getTransaction().commit();

        Employee foundedEmployee = session.get(Employee.class, 2);
        System.out.println(foundedEmployee);

        session.close();
        sessionFactory.close();
    }
}