package querying.sql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import querying.Product;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.getTransaction().begin();

        Product product1 = new Product("Milk", 14);
        Product product2 = new Product("Sugar", 24);
        Product product3 = new Product("Bread", 53);
        Product product4 = new Product("Butter", 245);
        Product product5 = new Product("Beer", 122);
        Product product6 = new Product("Eggs", 76);

        session.save(product1);
        session.save(product2);
        session.save(product3);
        session.save(product4);
        session.save(product5);
        session.save(product6);

        session.getTransaction().commit();

        String sql = "SELECT p.availablequantity FROM product p";
        NativeQuery sqlQuery = session.createSQLQuery(sql);

//        sqlQuery.addEntity(Product.class);

        List resultList = sqlQuery.getResultList();

        System.out.println(resultList);

        session.close();
        sessionFactory.close();
    }
}
