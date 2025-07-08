package User;

import Book.Book;
import Cart.Cart;
import Inventory.Storage;

public class Customer {
    private String name;
    private String email;
    private String address;
    Cart cart;
    Storage storage = new Storage();

    public Customer(String name){
        this.name = name;
        cart = new Cart();
        cart.customer = this;
    }
    public Customer(String name, String address){
        this.address = address;
        this.name = name;
        cart = new Cart();
        cart.customer = this;
    }

    public String getAddress() {
        return address;
    }

    public Customer(String name, String email, String address){
        this.email = email;
        this.name = name;
        this.address = address;
        cart = new Cart();
        cart.customer = this;
    }

    public void buy(Book book, int quantity){
        if(storage.isAvailable(book, quantity)){
            cart.addToCart(book, quantity);
            
        }
        else
            throw new IllegalArgumentException("The Required amount is not available.");
    }

    public void remove(Book book, int quantity){
        cart.removeFromCart(book, quantity);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public Cart getCart(){
        return cart;
    }
}
