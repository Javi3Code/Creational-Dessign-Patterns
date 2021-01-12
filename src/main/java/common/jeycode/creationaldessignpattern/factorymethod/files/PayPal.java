package common.jeycode.creationaldessignpattern.factorymethod.files;

public class PayPal extends AbstractPayment
{

      private static final String TICKET_MESSAGE = "Su pago se ha realizado";
      private static final String TICKET_NAME = "Paypal.txt";

      protected PayPal()
      {
            super();
            setTicketMessage(TICKET_MESSAGE);
            setTicketName(TICKET_NAME);
      }

      @Override
      protected boolean checkDatabase()
      {
            switch (variable)
            {
                  case "6543 445 55":
                        message = SUCCES;
                        return true;
                  case "708 945 999":
                        message = SUCCES;
                        return true;
                  default:
                        message = ERROR;
                        return false;
            }
      }

}
