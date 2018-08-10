package mapping.one_to_many;

import mapping.one_to_one.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static java.util.Arrays.asList;

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

        final Role adminRole = new Role();
        adminRole.setName("ADMIN");
        session.save(adminRole);

        final Role customerAdminRole = new Role();
        customerAdminRole.setName("CUSTOMER_ADMIN");
        session.save(customerAdminRole);

        final User user = new User();
        user.setName("Yevhenii");
        user.setRoles(asList(adminRole, customerAdminRole));

        session.save(user);

        session.getTransaction().commit();

        final User foundedUser = session.find(User.class, 3);
        System.out.println(foundedUser);

        session.close();
        factory.close();
    }
}
