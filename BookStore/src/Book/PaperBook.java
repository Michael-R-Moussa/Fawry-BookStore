package Book;

import User.Customer;
import ShippingService.*;


public class PaperBook extends Book implements IForSale{

    Shipping shipping = new Shipping();
    public PaperBook(String ISBN,int price, String title,  String year ) {
        super(ISBN,price,title,year);
    }


    @Override
    public Boolean isForSale() {
        return true;
    }

       public void Deliver(Customer customer) {
       if (customer.getAddress() == null || customer.getAddress().length() == 0)
           throw new IllegalArgumentException("No Address provided");
       else
           shipping.send(customer.getAddress(), this);
   }
}
