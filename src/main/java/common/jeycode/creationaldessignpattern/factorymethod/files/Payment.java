package common.jeycode.creationaldessignpattern.factorymethod.files;

public interface Payment
{

      String SUCCES = "Successful payment";
      String ERROR = "Payment could not be made";

      void configurePayment(String variable,int quantity);

      boolean makePayment();

      void getTicket();

}
