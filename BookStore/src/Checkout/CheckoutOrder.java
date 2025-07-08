package Checkout;

import Book.Book;
import Cart.Cart;
import Inventory.Storage;

import java.util.Map;

public class CheckoutOrder {
    private Map<Book, Integer> order;
    private int total;
    private Storage storage = new Storage();


    public CheckoutOrder(Cart cart){
        total = 0;
        order = cart.getOrderedBooks();
        finalizeOrder(cart);
    }

    private void finalizeOrder(Cart cart){
        System.out.println("************** Order details *****************");
        for(Map.Entry<Book, Integer> entry : order.entrySet()){
            entry.getKey().Deliver(cart.customer);
            total += entry.getKey().getPrice() * entry.getValue();
            storage.sell(entry.getKey(), entry.getValue());
        }
        System.out.println("Total price is : " + total);
    }




}
