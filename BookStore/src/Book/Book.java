package Book;

import User.Customer;

public abstract class Book {

    protected String ISBN;
    protected int price;
    protected String title;
    protected String year;


    public Book(String ISBN, int price, String title, String year) {
        this.ISBN = ISBN;
        this.price = price;
        this.title = title;
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

   public abstract void Deliver(Customer customer);

}
