package com.hibernate.books;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.books.model.Books;
import com.hibernate.books.factory.BooksFactory;

public class AccessBook {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("student.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session ses = factory.openSession();

        try {
            ses.beginTransaction();

            BooksFactory factory = BooksFactory.getInstance();

            for (Books book : factory.getAllBooks()) {
                System.out.println("Book ISBN: " + book.getIsbn());
            }

            Books book = factory.getAllBooks().get(1);
            book.setBookName("Algorithm");
            ses.saveOrUpdate(book);

            ses.getTransaction().commit();
        } catch (Exception e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            ses.close();
            factory.close();
        }
    }
}
