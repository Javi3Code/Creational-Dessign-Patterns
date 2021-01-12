package common.jeycode.creationaldessignpattern.factorymethod.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public abstract class AbstractPayment implements Payment
{

      protected String variable,message,ticketMessage,ticketName;
      protected int quantity;
      protected File file;

      protected AbstractPayment()
      {}

      @Override
      public void configurePayment(String variable,int quantity)
      {
            this.variable = variable;
            this.quantity = quantity;
      }

      @Override
      public boolean makePayment()
      {
            var received = checkDatabase();
            System.out.println(message);
            return received;
      }

      @Override
      public void getTicket()
      {
            file = new File("src//" + ticketName);
            try (var writer = new FileWriter(file))
            {
                  writer.write(LocalDate.now() + " :: " + LocalTime.now() + "\n" + ticketMessage + "\nCantidad:" + quantity + " €");
            }
            catch (IOException ex)
            {
                  ex.printStackTrace();
            }
      }

      protected abstract boolean checkDatabase();

      public void setTicketMessage(String ticketMessage)
      {
            this.ticketMessage = ticketMessage;
      }

      public void setTicketName(String ticketName)
      {
            this.ticketName = ticketName;
      }
}
