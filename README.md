## Project Structure

```
BookStore/
│
├── src/
│   ├── Main.java
│   ├── Book/
│   │   ├── Book.java
│   │   ├── EBook.java
│   │   ├── IForSale.java
│   │   ├── PaperBook.java
│   │   └── ShowCase.java
│   ├── Cart/
│   │   └── Cart.java
│   ├── Checkout/
│   │   └── CheckoutOrder.java
│   ├── Inventory/
│   │   └── Storage.java
│   ├── MailService/
│   │   └── Mail.java
│   ├── ShippingService/
│   │   └── Shipping.java
│   └── User/
│       └── Customer.java
```

## Overview

This is a simple Java-based BookStore system that supports physical and electronic books, customer management, inventory, cart, checkout, and delivery via shipping or email.

## Class Descriptions

### Book Package

- [`Book.Book`](src/Book/Book.java): Abstract base class for all books. Contains common fields (ISBN, price, title, year) and an abstract `Deliver(Customer)` method.
- [`Book.IForSale`](src/Book/IForSale.java): Interface for books that can be sold, with a method `isForSale()`.
- [`Book.PaperBook`](src/Book/PaperBook.java): Represents a physical book. Implements delivery via shipping address.
- [`Book.EBook`](src/Book/EBook.java): Represents an electronic book. Implements delivery via email.
- [`Book.ShowCase`](src/Book/ShowCase.java): Represents a showcase (display-only) book. Not for sale and cannot be delivered.

### Cart Package

- [`Cart.Cart`](src/Cart/Cart.java): Represents a shopping cart for a customer. Manages adding/removing books and their quantities.

### User Package

- [`User.Customer`](src/User/Customer.java): Represents a customer with name, email, address, and a cart. Can buy and remove books.

### Inventory Package

- [`Inventory.Storage`](src/Inventory/Storage.java): Manages the inventory of books, including adding, removing, checking availability, and selling books.

### Checkout Package

- [`Checkout.CheckoutOrder`](src/Checkout/CheckoutOrder.java): Handles the checkout process, finalizes orders, calculates total price, and triggers delivery.

### MailService Package

- [`MailService.Mail`](src/MailService/Mail.java): Handles sending eBooks to customers via email.

### ShippingService Package

- [`ShippingService.Shipping`](src/ShippingService/Shipping.java): Handles shipping of physical books to customer addresses.

### Main

- [`Main`](src/Main.java): Demonstrates the usage of the system by creating books, customers, adding books to inventory, buying books, and checking out.

## How It Works

- Books are added to the inventory.
- Customers can buy books (if available) and add them to their cart.
- On checkout, the system processes the order, delivers each book (via shipping or email), and updates the inventory.

## Notes

- The system uses simple `System.out.println` statements for demonstration of delivery and inventory actions.
- The `ShowCase` book is not for sale and cannot be delivered.
- The `PaperBook` and `EBook` classes implement their own delivery logic.

Test cases:
1- Successful attempts
![image](https://github.com/user-attachments/assets/a0de696f-adcb-43b1-bce1-09ad076b457e)

2- Insufficient amount of books:
![image](https://github.com/user-attachments/assets/f38de6d1-c169-4d7e-b6f6-31e6ceb3e282)

3- Email not provided
![image](https://github.com/user-attachments/assets/2524c74e-3450-4b7b-99cc-f3b3d8a7a166)

4- Removing books after a certain amount
![image](https://github.com/user-attachments/assets/eb3e597a-7609-44aa-8d7e-6a3058aed701)



