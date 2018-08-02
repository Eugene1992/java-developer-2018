import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setAge(5);
        animal.setName("Vaska");
        animal.setId(20);

        SessionFactory factory = new Configuration()
                .configure("hib.xml")
                .buildSessionFactory();

        Session session = factory.openSession();

        session.beginTransaction();
        session.save(animal);
        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
