package Book;

import MailService.Mail;
import User.Customer;

public class EBook extends Book implements IForSale{

    Mail mail = new Mail();
    private String fileType;
    public EBook(String ISBN,int price, String title,  String year, String fileType) {
        super(ISBN, price, title, year);
        this.fileType = fileType;
    }

    @Override
    public Boolean isForSale() {
        return true;
    }

   @Override
   public void Deliver(Customer customer) {
       if (customer.getEmail() == null || customer.getEmail().length() == 0)
           throw new IllegalArgumentException("No email provided");
       else
           mail.send(customer.getEmail(), this);
   }
}
