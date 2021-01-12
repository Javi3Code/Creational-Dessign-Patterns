package common.jeycode.creationaldessignpattern.factorymethod.files;

public enum PaymentType
{

 CREDIT_CARD(new CreditCard()),
 BIZUM(new Bizum()),
 NORMAL_WIRE_TRANSFER(new NormalWireTransfer()),
 BANK_DEPOSIT(new BankDeposit()),
 PAYPAL(new PayPal());

      protected Payment payment;

      PaymentType(Payment payment)
      {
            this.payment = payment;
      }
}
