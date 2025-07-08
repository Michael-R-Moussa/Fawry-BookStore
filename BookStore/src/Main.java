import Book.PaperBook;
import Checkout.CheckoutOrder;
import Book.*;
import Inventory.Storage;
import User.Customer;

public class Main {
    public static void main(String[] args) {
        Book book = new PaperBook("abc123",220,"The Atomic Habits", "2002");
        Book ebook = new EBook ("1452dd", 15, "The Song of Ice And Fire", "2011", "EPUP");
        Book showcase = new ShowCase("854fdfsd", "Demo book", "1988");

        Storage storage = new Storage();
        storage.addBook(book,2);
        storage.addBook(ebook, 15);
        storage.addBook(showcase, 5);

        storage.checkAllbooks();
        
        Customer Michael = new Customer("Michael","15Faisal");
        
        //the following is to showcase the lack of email or address
        Customer Ahmed = new Customer("Ahmed","15Faisal");
        Customer Hany = new Customer("Hany");

        Michael.buy(book, 1);
        Michael.buy(ebook, 2);
        // CheckoutOrder Michaelcheck = new CheckoutOrder(Michael.getCart());

        storage.removeExpired(book);
        storage.checkAllbooks();



    }
}