package common.jeycode.creationaldessignpattern.factorymethod.files;

public enum PaymentType {
// @formatter:off
																									CREDIT_CARD(new CreditCard()), 
																									BIZUM(new Bizum()), 
																									NORMAL_WIRE_TRANSFER(new NormalWireTransfer()),
																									BANK_DEPOSIT(new BankDeposit()),
																									PAYPAL(new PayPal());
// @formatter:on

						protected Payment payment;

						PaymentType(Payment payment) { this.payment = payment; }
}
