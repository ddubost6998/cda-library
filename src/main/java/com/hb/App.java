package com.hb;

import com.hb.service.BookService;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        // Ajouter des livres
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book2 = new Book("1984", "George Orwell", 1949);
        Book book3 = new Book("Pride and Prejudice", "Jane Austen", 1813);
        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);

        // Récupérer et afficher les livres
        bookService.getBooks().forEach(book -> 
            System.out.println("Book: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Age: " + book.getAge())
        );
    }
}
