package MailService;

import Book.Book;

public class Mail {
    public Mail(){}
    public void send(String mail , Book book) {
        System.out.println(book.getTitle() + " is sent to " +mail);
    }
}
