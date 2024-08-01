package com.hb.service;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hb.Book;
import com.hb.config.HibernateConfig;

public class BookService {
    public void addBook(Book book) {
        Transaction transaction = null;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Book> getBooks() {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            return session.createQuery("from Book", Book.class).list();
        }
    }
}
