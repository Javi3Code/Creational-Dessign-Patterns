package common.jeycode.creationaldessignpattern.factorymethod.files;

public class BankDeposit extends AbstractPayment
{

      private static final String TICKET_MESSAGE = "Ha efectuado el depósito con éxito";
      private static final String TICKET_NAME = "BankDeposit.txt";

      protected BankDeposit()
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
                  case "CAXA14323141412":
                        message = SUCCES;
                        return true;
                  case "SAN24334242424":
                        message = SUCCES;
                        return true;
                  default:
                        message = ERROR;
                        return false;
            }
      }
}
