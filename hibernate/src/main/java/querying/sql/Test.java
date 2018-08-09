package querying.sql;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import querying.Product;
import querying.ProductPopulateUtil;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hib.xml")
                .buildSessionFactory();

        Session session = factory.openSession();

        ProductPopulateUtil.populateProducts();

        String sql = "SELECT * FROM Product";
        SQLQuery query = session.createSQLQuery(sql);
        query.addEntity(Product.class);
        List<Product> results = query.list();

        System.out.println(results);

        session.close();
        factory.close();
    }
}
