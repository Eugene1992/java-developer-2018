package querying.criteria;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
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

        Criteria cr = session.createCriteria(Product.class);

        cr.add(Restrictions.gt("availablequantity", 100));

        List results = cr.list();
        System.out.println(results);

        session.close();
        factory.close();
    }
}
