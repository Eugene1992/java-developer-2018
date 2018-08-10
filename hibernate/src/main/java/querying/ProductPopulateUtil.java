package querying;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by yede0517 on 8/9/2018.
 */
public class ProductPopulateUtil {

    public static void populateProducts() {
        SessionFactory factory = new Configuration()
                .configure("hib.xml")
                .buildSessionFactory();

        Session session = factory.openSession();

        session.beginTransaction();

        final Product product1 = new Product("Milk", 100, 12);
        final Product product2 = new Product("Bread", 200, 42);
        final Product product3 = new Product("Cheese", 600, 432);
        final Product product4 = new Product("Beer", 300, 12);
        final Product product5 = new Product("Chips", 520, 4);

        session.save(product1);
        session.save(product2);
        session.save(product3);
        session.save(product4);
        session.save(product5);

        session.getTransaction().commit();

        session.close();
        factory.close();
    }
}
