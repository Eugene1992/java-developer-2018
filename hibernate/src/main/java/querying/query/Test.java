package querying.query;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import querying.Product;
import querying.ProductPopulateUtil;

import javax.persistence.Query;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hib.xml")
                .buildSessionFactory();

        Session session = factory.openSession();

        ProductPopulateUtil.populateProducts();

        String hql = "FROM Product";
        Query query = session.createQuery(hql);
        List results = query.getResultList();
        System.out.println(results);

        session.close();
        factory.close();
    }
}
