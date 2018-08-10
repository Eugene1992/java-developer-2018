package relations.one_to_many;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static java.util.Arrays.asList;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.getTransaction().begin();

        Role userRole = new Role("USER");
        Role adminRole = new Role("ADMIN");

        session.save(userRole);
        session.save(adminRole);

        User user = new User("Yevhenii", asList(userRole, adminRole));
        session.save(user);

        session.getTransaction().commit();

        User foundedUser = session.get(User.class, 3);
        System.out.println(foundedUser);

        session.close();
        sessionFactory.close();
    }
}