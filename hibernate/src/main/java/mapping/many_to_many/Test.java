package mapping.many_to_many;

import mapping.one_to_many.Role;
import mapping.one_to_many.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;

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

        final Book book1 = new Book();
        book1.setName("Book #1");

        final Book book2 = new Book();
        book2.setName("Book #2");

        final Book book3 = new Book();
        book3.setName("Book #3");

        session.save(book1);
        session.save(book2);
        session.save(book3);

        final Author author1 = new Author();
        author1.setName("Author #1");

        final Author author2 = new Author();
        author2.setName("Author #2");

        author1.setBooks(new HashSet<>(asList(book1, book2)));
        author2.setBooks(new HashSet<>(asList(book2, book3)));

        session.save(author1);
        session.save(author2);

        session.getTransaction().commit();

        final Author author = session.find(Author.class, 5);
        System.out.println(author);

        session.close();
        factory.close();
    }
}
