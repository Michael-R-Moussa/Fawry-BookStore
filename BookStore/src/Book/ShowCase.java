package Book;

import User.Customer;

public class ShowCase extends Book implements IForSale{

    public ShowCase(String ISBN, String title, String year){
        super(ISBN, 0, title, year);
    }

    @Override
    public Boolean isForSale() {
        return false;
    }

    public void Deliver(Customer customer){
        return;
    }

    
}
