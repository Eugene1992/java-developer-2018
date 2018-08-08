import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Animal animal = new Animal("Flufy", "Dog");
        session.save(animal);

        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
