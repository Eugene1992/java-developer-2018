/*
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

        Employee employee = new Employee("Yevhenii", "Deineka");
        session.save(employee);
        employee.setFirstName("Eugene");
        session.save(employee);

        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
*/
