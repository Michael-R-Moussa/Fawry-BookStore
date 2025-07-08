package ShippingService;

import Book.Book;

public class Shipping {

    public Shipping(){}

    public void send(String address , Book book) {
        System.out.println(book.getTitle() + " is shipped to " +address);
    }
}
