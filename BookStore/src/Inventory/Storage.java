package Inventory;
import Book.Book;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    private static Map<Book,Integer> booksAvailable = new HashMap<>();

    public Boolean isAvailable (Book book, int quantity) {
        Integer available = booksAvailable.get(book);
        return available != null && available >= quantity;
    }

    public void showInfo(Book book){
        System.out.println("************** " + book.getTitle() + " **************");
        System.out.println("Book title: " + book.getTitle());
        System.out.println("Book ISBN: " + book.getISBN());
        System.out.println("Book Price: " + book.getPrice());
        System.out.println("published: " + book.getYear());
        if(booksAvailable.get(book) > 0)
            System.out.println("amount of available books: " + booksAvailable.get(book));
        else
            System.out.println("Unfortunately, this book is not available.");

        System.out.println("------------------------------------------------------");
    }

    public void addBook(Book book, int quantity){
        booksAvailable.put(book, quantity);
    }
    public void removeBook(Book book){
        booksAvailable.put(book, 0);
    }

    public void checkAllbooks(){
        System.out.println("*****************All Inventroy Books *****************");
        System.out.println("Currently Available Books: ");
        for(Map.Entry<Book, Integer> entry : booksAvailable.entrySet()){
            System.out.println(entry.getKey().getTitle());
            System.out.println(entry.getValue());
        }
    }

    public void sell(Book book, int quantity){
        booksAvailable.put(book, booksAvailable.get(book) - quantity);
    }

}
