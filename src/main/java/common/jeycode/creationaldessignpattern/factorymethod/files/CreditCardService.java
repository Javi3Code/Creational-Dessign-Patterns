package common.jeycode.creationaldessignpattern.factorymethod.files;

import java.util.Objects;

public class CreditCardService implements PaymentFactory {

						private static CreditCardService factoryInstance;

						private CreditCardService() {}

						public static PaymentFactory getPaymentServiceInstance() {
												factoryInstance = Objects.isNull(factoryInstance) ? new CreditCardService() : factoryInstance;
												return factoryInstance;
						}

						@Override
						public Payment createPayment() { return PaymentType.CREDIT_CARD.payment; }

}
