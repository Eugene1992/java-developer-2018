package relations.many_to_many;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static java.util.Arrays.asList;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.getTransaction().begin();

        Book book1 = new Book("Book #1");
        Book book2 = new Book("Book #2");
        Book book3 = new Book("Book #3");

        Author author1 = new Author("Author #1");
        Author author2 = new Author("Author #2");

        session.save(book1);
        session.save(book2);
        session.save(book3);

        author1.setBooks(asList(book1, book2));
        author2.setBooks(asList(book2, book3));

        book1.setAuthors(asList(author1));
        book2.setAuthors(asList(author1, author2));
        book3.setAuthors(asList(author2));

        session.save(author1);
        session.save(author2);

        session.getTransaction().commit();

        Author foundedAuthor1 = session.get(Author.class, 4);
        System.out.println(foundedAuthor1);
        System.out.println(foundedAuthor1.getBooks());

        Author foundedAuthor2 = session.get(Author.class, 5);
        System.out.println(foundedAuthor2);
        System.out.println(foundedAuthor2.getBooks());

        Book foundedBook1 = session.get(Book.class, 1);
        System.out.println(foundedBook1);
        System.out.println(foundedBook1.getAuthors());

        session.close();
        sessionFactory.close();
    }
}