package mapping.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

/**
 * Created by yede0517 on 8/7/2018.
 */
public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hib.xml")
                .buildSessionFactory();

        Session session = factory.openSession();

        session.beginTransaction();

        final Address address = new Address();
        address.setStreet("Kreshchatyk");

        session.save(address);

        final Employee employee = new Employee();
        employee.setName("Yevhenii");
        employee.setAddress(address);

        session.save(employee);

        session.getTransaction().commit();

        final Employee employee1 = session.find(Employee.class, 2);
        System.out.println(employee1);

        session.close();
        factory.close();
    }
}
