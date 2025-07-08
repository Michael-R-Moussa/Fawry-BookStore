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
        storage.addBook(book,20);
        storage.addBook(ebook, 15);
        storage.addBook(showcase, 5);

        storage.checkAllbooks();
        
        Customer Michael = new Customer("Michael","Michael@gmail.com","15Faisal");
        
        //the following is to showcase the lack of email or address
        Customer Ahmed = new Customer("Ahmed","15Faisal");
        Customer Hany = new Customer("Hany");

        Michael.buy(ebook, 2);
        Michael.buy(book, 3);
        CheckoutOrder Michaelcheck = new CheckoutOrder(Michael.getCart());

        storage.checkAllbooks();

        // Ahmed.buy(ebook, 2);
        Ahmed.buy(book, 3);
        CheckoutOrder Ahmedcheck = new CheckoutOrder(Ahmed.getCart());

        storage.checkAllbooks();
    }
}