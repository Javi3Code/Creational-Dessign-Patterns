package common.jeycode.creationaldessignpattern.factorymethod;

import common.jeycode.creationaldessignpattern.factorymethod.files.BankDepositService;
import common.jeycode.creationaldessignpattern.factorymethod.files.Payment;
import common.jeycode.creationaldessignpattern.factorymethod.files.PaymentFactory;

public class FactoryMethodPattern
{

						private final Payment payment;

						public FactoryMethodPattern(PaymentFactory service)
						{
												payment = service.createPayment();
												payment.configurePayment("CAXA14323141412",3000);
												if (payment.makePayment())
												{
																		payment.getTicket();
												}
						}

						public static void main(String[] args)
						{
												var service = BankDepositService.getPaymentServiceInstance();
//												var service=BizumService.getPaymentServiceInstance();
//												var service = CreditCardService.getPaymentServiceInstance();
//												var service = NormalWireTransferService.getPaymentServiceInstance();
//												var service = PaypalService.getPaymentServiceInstance();

												new FactoryMethodPattern(service);

						}
}
