package Cart;

import Book.Book;
import User.Customer;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    public Customer customer;

    private Map<Book, Integer> orderedBooks = new HashMap<>();

    public void addToCart(Book book, int quantity) {
        orderedBooks.put(book,quantity);
    }
    public void removeFromCart(Book book, int quantity) {
        orderedBooks.put(book,(orderedBooks.get(book)-quantity));
    }

    public Map<Book, Integer> getOrderedBooks() {
        return orderedBooks;
    }
}
